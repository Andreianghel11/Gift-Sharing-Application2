package childrensortcommand;

import database.Child;

import java.util.Comparator;
import java.util.List;

/**
 * Defines objects used to sort
 * a children list by nice score.
 */
public class SortNiceScore implements SortCommand {
    private List<Child> childList;

    public SortNiceScore(final List<Child> childList) {
        this.childList = childList;
    }

    /**
     * First sort the children by id, as this
     * is the secondary sorting criteria. Then
     * sorts them by nice score in descending order.
     */
    @Override
    public void execute() {
        childList.sort(Comparator.comparingInt(Child::getId));
        childList.sort(Comparator.comparingDouble(Child::getNiceScore).reversed());
    }
}
