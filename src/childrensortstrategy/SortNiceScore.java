package childrensortstrategy;

import database.Child;

import java.util.Comparator;
import java.util.List;

public class SortNiceScore implements SortStrategy{
    @Override
    public void sort(List<Child> childList) {
        childList.sort(Comparator.comparingInt(Child::getId));
        childList.sort(Comparator.comparingDouble(Child::getNiceScore).reversed());
    }
}
