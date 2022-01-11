package childrensortcommand;

import database.Child;

import java.util.Comparator;
import java.util.List;

public class SortId implements SortCommand {
    private List<Child> childList;

    public SortId(List<Child> childList) {
        this.childList = childList;
    }

    @Override
    public void execute() {
        childList.sort(Comparator.comparingInt(Child::getId));
    }
}
