package task3;

import java.util.ArrayList;
import java.util.List;

public final class DiagramCanvas {
    private List<DiagramComponent> components = new ArrayList<>();

    public void addComponent(final DiagramComponent diagramComponent) {
        components.add(diagramComponent);
    }

    public void removeComponent(final DiagramComponent diagramComponent) {
        components.remove(diagramComponent);
    }

    public DiagramComponent getComponent(final int id) {
        return components.get(id);
    }

    public void show() {
        System.out.println("Diagram:");
        components.forEach(System.out::println);
    }
}
