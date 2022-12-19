package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public final class DataRepository extends Observable {
    private List<SensorData> dataArrayList = new ArrayList<>();
    public void addData(final SensorData dataRecord) {
        dataArrayList.add(dataRecord);
        ServerMessage serverMessage = new ServerMessage(dataRecord.getStepsCount(), Utils.getClientId(), dataRecord.getTimestamp());

        setChanged();
        notifyObservers(dataRecord);
        notifyObservers(serverMessage);
    }

    public List<SensorData> getDataArrayList() {
        return dataArrayList;
    }

    public void setDataArrayList(final List<SensorData> dataArrayList) {
        this.dataArrayList = dataArrayList;
    }
}
