package childrensortcommand;

import database.Child;
import database.City;
import database.UtilsCityList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Defines objects used to sort a children
 * list by city average nice score.
 */
public class SortNiceScoreCity implements SortCommand {
    private List<Child> childList;

    public SortNiceScoreCity(final List<Child> childList) {
        this.childList = childList;
    }

    /**
     * Creates a city list based on the cities
     * of the children. Calculates the average
     * nice score of the cities, then sorts them.
     * In the end, builds the newly sorted children list.
     */
    @Override
    public void execute() {
        List<City> cityList = new ArrayList<>();
        for (Child child : childList) {
            if (!UtilsCityList.cityListHasCity(cityList, child.getCity())) {
                City newCity = new City(child.getCity());
                newCity.getChildList().add(child);
                cityList.add(newCity);
            } else {
                City currentCity = UtilsCityList.getCityByName(cityList, child.getCity());
                currentCity.getChildList().add(child);
            }
        }

        /*
          First sort the cities alphabetically as
          this is the secondary sorting criteria.
          Then sort them by average nice score is
          descending order.
         */
        cityList.sort(Comparator.comparing(City::getName));
        cityList.sort(Comparator.comparingDouble(City::calculateNiceScoreCity).reversed());

        /*
          For every city, the children
          are already sorted by id.
         */
        childList.clear();
        for (City city : cityList) {
            for (Child child : city.getChildList()) {
                childList.add(child);
            }
        }
    }
}
