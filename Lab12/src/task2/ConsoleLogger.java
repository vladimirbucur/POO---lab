package task2;

public class ConsoleLogger extends LoggerBase {
    public ConsoleLogger() {
        super(LogLevel.all());
    }

    @Override
    protected void writeMessage(final String message) {
        System.out.println("[Console] " + message);
    }
}
