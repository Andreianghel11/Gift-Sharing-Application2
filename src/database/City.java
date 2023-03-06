package database;

import java.util.ArrayList;
import java.util.List;

/**
 * Class defines objects that store
 * data about cities. Every city stores
 * a list of children that live there.
 */
public final class City {
    private String name;

    private List<Child> childList;

    public City(final String name) {
        this.name = name;
        this.childList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<Child> getChildList() {
        return childList;
    }

    public void setChildList(final List<Child> childList) {
        this.childList = childList;
    }

    /**
     * Calculates the nice score of a
     * city based on the nice scores of the
     * children found in the list.
     */
    public double calculateNiceScoreCity() {
        double sum = 0;
        for (Child child : childList) {
            sum += child.getNiceScore();
        }
        return sum / childList.size();
    }
}
