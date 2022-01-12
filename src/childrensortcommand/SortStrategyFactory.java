package childrensortcommand;

import common.Constants;
import database.Child;

import java.util.List;

/**
 * Class used to create a specific
 * SortCommand object based on the child's city.
 */
public final class SortStrategyFactory {
    private SortStrategyFactory() { }

    /**
     * Factory method to create a specific object.
     */
    public static SortCommand createSortStrategy(final String type, final List<Child> childList) {
        return switch (type) {
            case Constants.ID -> new SortId(childList);
            case Constants.NICE_SCORE -> new SortNiceScore(childList);
            case Constants.NICE_SCORE_CITY -> new SortNiceScoreCity(childList);
            default -> null;
        };
    }
}

