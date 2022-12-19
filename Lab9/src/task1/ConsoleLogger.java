package task1;

import java.util.Observable;
import java.util.Observer;

public final class ConsoleLogger implements Observer {
    @Override
    public void update(final Observable o, final Object arg) {
        System.out.println("New sensor data: " + arg.toString());
    }
}
