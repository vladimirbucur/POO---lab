package task3;

public final class ChangeColorCommand implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private int index;
    private String color;
    private String previousColor;

    public ChangeColorCommand(final DiagramCanvas diagramCanvas, final int index, final String color) {
        this.diagramCanvas = diagramCanvas;
        this.index = index;
        this.color = color;
    }

    @Override
    public void execute() {
        previousColor = diagramCanvas.getComponent(index).getColor();
        diagramCanvas.getComponent(index).setColor(color);
    }

    @Override
    public void undo() {
        diagramCanvas.getComponent(index).setColor(previousColor);
    }

    @Override
    public String toString() {
        return "ChangeColorCommand{" +
                "diagramCanvas=" + diagramCanvas +
                ", index=" + index +
                ", color='" + color + '\'' +
                '}';
    }
}
