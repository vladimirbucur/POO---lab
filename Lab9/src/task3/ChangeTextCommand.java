package task3;

public final class ChangeTextCommand implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private int index;
    private String text;
    private String previousText;

    public ChangeTextCommand(final DiagramCanvas diagramCanvas, final int index, final String text) {
        this.diagramCanvas = diagramCanvas;
        this.index = index;
        this.text = text;
    }

    @Override
    public void execute() {
        previousText = diagramCanvas.getComponent(index).getText();
        diagramCanvas.getComponent(index).setText(text);
    }

    @Override
    public void undo() {
        diagramCanvas.getComponent(index).setText(previousText);
    }

    @Override
    public String toString() {
        return "ChangeTextCommand{" +
                "diagramCanvas=" + diagramCanvas +
                ", index=" + index +
                ", text='" + text + '\'' +
                '}';
    }
}
