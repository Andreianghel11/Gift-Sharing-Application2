package childrensortcommand;

import database.Child;
import database.City;
import database.Utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortNiceScoreCity implements SortCommand {
    private List<Child> childList;

    public SortNiceScoreCity(List<Child> childList) {
        this.childList = childList;
    }

    @Override
    public void execute() {
        List<City> cityList = new ArrayList<>();
        for (Child child : childList) {
            if (!Utils.cityListHasCity(cityList, child.getCity())) {
                City newCity = new City(child.getCity());
                newCity.getChildList().add(child);
                cityList.add(newCity);
            } else {
                City currentCity = Utils.getCityByName(cityList, child.getCity());
                currentCity.getChildList().add(child);
            }
        }

        cityList.sort(Comparator.comparing(City::getName));
        cityList.sort(Comparator.comparingDouble(City::calculateNiceScoreCity).reversed());

        childList.clear();
        for (City city : cityList) {
            for (Child child : city.getChildList()) {
                childList.add(child);
            }
        }
    }
}
