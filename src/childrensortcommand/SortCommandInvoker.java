package childrensortcommand;


/**
 * Defines an invoker object used
 * to call sort commands.
 */
public final class SortCommandInvoker {
    /**
     * Applies the required sorting algorithm.
     */
    public void sort(final SortCommand sortCommand) {
        sortCommand.execute();
    }
}
