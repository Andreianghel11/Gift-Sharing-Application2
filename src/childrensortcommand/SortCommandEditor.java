package childrensortcommand;

import java.util.LinkedList;

public class SortCommandEditor {
    private LinkedList<SortCommand> history = new LinkedList<>();

    public void edit(SortCommand sortCommand) {
        history.push(sortCommand);
        sortCommand.execute();
    }
}
