package childrensortcommand;

import database.Child;

import java.util.Comparator;
import java.util.List;

public class SortNiceScore implements SortCommand {
    private List<Child> childList;

    public SortNiceScore(List<Child> childList) {
        this.childList = childList;
    }

    @Override
    public void execute() {
        childList.sort(Comparator.comparingInt(Child::getId));
        childList.sort(Comparator.comparingDouble(Child::getNiceScore).reversed());
    }
}
