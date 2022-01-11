package database;

import java.util.List;

public final class Utils {
    public static boolean cityListHasCity(List<City> cityList, String cityName) {
        for (City city : cityList) {
            if (city.getName().equals(cityName)) {
                return true;
            }
        }
        return false;
    }

    public static City getCityByName(List<City> cityList, String cityName) {
        for (City city : cityList) {
            if (city.getName().equals(cityName)) {
                return city;
            }
        }
        return null;
    }
}
