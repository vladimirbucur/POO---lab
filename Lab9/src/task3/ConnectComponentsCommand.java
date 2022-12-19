package task3;

public final class ConnectComponentsCommand implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private String comp1;
    private String comp2;

    public ConnectComponentsCommand(final DiagramCanvas diagramCanvas, final String comp1, final String comp2) {
        this.diagramCanvas = diagramCanvas;
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public void execute() {
        diagramCanvas.getComponent(Integer.parseInt(comp1)).connectTo(comp2);
        diagramCanvas.getComponent(Integer.parseInt(comp2)).connectTo(comp1);
    }

    @Override
    public void undo() {
        diagramCanvas.getComponent(Integer.parseInt(comp1)).removeConnection(comp2);
        diagramCanvas.getComponent(Integer.parseInt(comp2)).removeConnection(comp1);
    }

    @Override
    public String toString() {
        return "ConnectComponentsCommand{" +
                "diagramCanvas=" + diagramCanvas +
                ", comp1='" + comp1 + '\'' +
                ", comp2='" + comp2 + '\'' +
                '}';
    }
}
