package task3;

import java.util.LinkedList;

public final class Invoker {

    private final LinkedList<DrawCommand> historyExecuted = new LinkedList<>();
    private final LinkedList<DrawCommand> historyUndo = new LinkedList<>();

    /**
     * Clear up all the used resources, start fresh :D
     */
    public void restart() {
        historyExecuted.clear();
        historyUndo.clear();
    }

    /**
     * Executes a given command
     *
     * @param command - command
     */
    public void execute(final DrawCommand command) {
        historyExecuted.push(command);
        command.execute();
    }

    /**
     * Undo the latest command
     */
    public void undo() {
        if (historyExecuted.isEmpty())
            return;
        DrawCommand drawCommand = historyExecuted.pop();
        if (drawCommand != null) {
            historyUndo.push(drawCommand);
            drawCommand.undo();
        }
    }

    /**
     * Redo command previously undone. Cannot perform a redo after an execute, only after at least one undo.
     */
    public void redo() {
        if (historyUndo.isEmpty())
            return;
        DrawCommand drawCommand = historyUndo.pop();
        if (drawCommand != null) {
            historyExecuted.push(drawCommand);
            drawCommand.execute();
        }
    }
}