package task3;

public final class DrawRectangleCommand implements DrawCommand{
    private DiagramCanvas diagramCanvas;
    private DiagramComponent addedComponent;
    public DrawRectangleCommand(final DiagramCanvas diagramCanvas) {
        this.diagramCanvas = diagramCanvas;
    }

    @Override
    public void execute() {
        addedComponent = new DiagramComponent();
        diagramCanvas.addComponent(addedComponent);
    }

    @Override
    public void undo() {
        diagramCanvas.removeComponent(addedComponent);
    }

    @Override
    public String toString() {
        return "DrawRectangleCommand{" +
                "diagramCanvas=" + diagramCanvas +
                '}';
    }
}
