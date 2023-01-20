package task2;

import java.util.EnumSet;

public class EmailLogger extends LoggerBase {
    public EmailLogger() {
        super(EnumSet.of(LogLevel.FunctionalMessage, LogLevel.FunctionalError));
    }

    @Override
    protected void writeMessage(final String message) {
        System.out.println("[Email] " + message);
    }
}
