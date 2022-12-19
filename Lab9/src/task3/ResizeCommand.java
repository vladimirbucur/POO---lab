package task3;

public final class ResizeCommand implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private int index;
    private double percentage;
    private double lastPercentage;
    public ResizeCommand(final DiagramCanvas diagramCanvas, final int index, final double procent) {
        this.diagramCanvas = diagramCanvas;
        this.index = index;
        this.percentage= procent;
    }

    @Override
    public void execute() {
        diagramCanvas.getComponent(index).setHeight((int)(diagramCanvas.getComponent(index).getHeight() * percentage / 100));
        diagramCanvas.getComponent(index).setWeight((int)(diagramCanvas.getComponent(index).getWeight() * percentage / 100));
        lastPercentage = percentage;
    }


    @Override
    public void undo() {
        diagramCanvas.getComponent(index).setHeight((int)(diagramCanvas.getComponent(index).getHeight() * 100 / lastPercentage));
        diagramCanvas.getComponent(index).setWeight((int)(diagramCanvas.getComponent(index).getWeight() *100 / percentage));
    }

    @Override
    public String toString() {
        return "ResizeCommand{" +
                "diagramCanvas=" + diagramCanvas +
                ", index=" + index +
                ", percentage=" + percentage +
                '}';
    }
}

