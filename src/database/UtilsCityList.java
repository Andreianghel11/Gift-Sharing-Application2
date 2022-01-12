package database;

import java.util.List;

/**
 * Utility class containing methods
 * regarding lists of City objects.
 */
public final class UtilsCityList {
    private UtilsCityList() { }

    /**
     * Checks if a City list contains a certain
     * City with a given name - String.
     */
    public static boolean cityListHasCity(final List<City> cityList, final String cityName) {
        for (City city : cityList) {
            if (city.getName().equals(cityName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the city with a certain
     * name (String) from the list.
     * Returns null if the city isn't found.
     */
    public static City getCityByName(final List<City> cityList, final String cityName) {
        for (City city : cityList) {
            if (city.getName().equals(cityName)) {
                return city;
            }
        }
        return null;
    }
}
