package task1;

public final class ServerMessage {
    private final int steps;
    private final int clientid;
    private final long timestamp;

    ServerMessage(final int steps, final int clientid, final long timestamp) {
        this.steps = steps;
        this.clientid = clientid;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "{" +
                "steps=" + steps +
                ", clientid=" + clientid +
                ", timestamp=" + timestamp +
                '}';
    }
}
