package database;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;

    private List<Child> childList;

    public City(String name) {
        this.name = name;
        this.childList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Child> getChildList() {
        return childList;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }

    public double calculateNiceScoreCity() {
        double sum = 0;
        for (Child child : childList) {
            sum += child.getNiceScore();
        }

        return sum / childList.size();
    }
}
