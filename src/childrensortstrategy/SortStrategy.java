package childrensortstrategy;

import database.Child;

import java.util.List;

public interface SortStrategy {
    void sort(List<Child> childList);
}
