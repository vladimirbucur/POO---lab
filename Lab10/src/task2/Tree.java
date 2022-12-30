package task2;

import java.util.HashSet;
import java.util.List;

public interface Tree<T extends Comparable<T>> {
    void addValue(final T value);

    void addAll(final List<T> values);

    HashSet<T> getValues(final T inf, final T sup);

    int size();

    boolean isEmpty();
}
