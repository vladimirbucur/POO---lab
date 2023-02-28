package task2;

import java.util.EnumSet;

public abstract class LoggerBase {
    private EnumSet<LogLevel> logLevels;
    private LoggerBase next;

    public LoggerBase(final EnumSet<LogLevel> logLevels) {
        this.logLevels = logLevels;
    }

    public void setNext(final LoggerBase next) {
        this.next = next;
    }

    protected abstract void writeMessage(final String message);

    public void message(final String message, final LogLevel level) {
        if (logLevels.contains(level)) {
            writeMessage(message);
        }
        if (next != null) {
            next.message(message, level);
        }
    }
}
