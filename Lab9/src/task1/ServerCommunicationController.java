package task1;

import java.util.Observable;
import java.util.Observer;

public final  class ServerCommunicationController implements Observer {
    @Override
    public void update(final Observable o, final Object arg) {
        ServerMessage serverMessage = new ServerMessage(((SensorData)(arg)).getStepsCount(), Utils.getClientId(), ((SensorData)(arg)).getTimestamp());
        System.out.println("Generated server message: " + serverMessage);
    }
}
