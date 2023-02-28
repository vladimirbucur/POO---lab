package task1;

import java.util.Collection;

public interface Calculator {
    class NullParameterException extends RuntimeException {
    }

    class UnderflowException extends RuntimeException {
    }

    class OverflowException extends RuntimeException {
    }

    Double add(final Double nr1, final Double nr2);

    Double divide(final Double nr1, final Double nr2);

    Double average(final Collection<Double> numbers);
}
