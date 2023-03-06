package childrensortcommand;

import database.Child;

import java.util.Comparator;
import java.util.List;

/**
 * Defines objects used to sort
 * a children list by id.
 */
public class SortId implements SortCommand {
    private List<Child> childList;

    public SortId(final List<Child> childList) {
        this.childList = childList;
    }

    /**
     * Sorts the children by id.
     */
    @Override
    public void execute() {
        childList.sort(Comparator.comparingInt(Child::getId));
    }
}
