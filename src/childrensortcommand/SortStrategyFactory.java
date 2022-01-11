package childrensortcommand;

import common.Constants;
import database.Child;

import java.util.List;

public final class SortStrategyFactory {
    private SortStrategyFactory() { }

    public static SortCommand createSortStrategy(String type, List<Child> childList) {
        return switch (type) {
            case Constants.ID -> new SortId(childList);
            case Constants.NICE_SCORE -> new SortNiceScore(childList);
            case Constants.NICE_SCORE_CITY -> new SortNiceScoreCity(childList);
            default -> null;
        };
    }
}

