package childrensortstrategy;

import common.Constants;

public final class SortStrategyFactory {
    private SortStrategyFactory() { }

    public static SortStrategy createSortStrategy(String type) {
        return switch (type) {
            case Constants.ID -> new SortId();
            case Constants.NICE_SCORE -> new SortNiceScore();
            case Constants.NICE_SCORE_CITY -> new SortNiceScoreCity();
            default -> null;
        };
    }
}
