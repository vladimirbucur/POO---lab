package task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiMapValue<K, V> {
    private final Map<K, ArrayList<V>> map = new HashMap<K, ArrayList<V>>();

    public final void add(final K key, final V value) {
        if (!this.getMap().containsKey(key)) {
            this.getMap().put(key, new ArrayList<>());
        }
        this.getMap().get(key).add(value);
    }

    public final void addAll(K key, List<V> values) {
        for (V value : values) {
            this.add(key, value);
        }
    }

    public final void addAll(final MultiMapValue<K, V> map) {
        for(Map.Entry<K, ArrayList<V>> entry : map.getMap().entrySet()) {
            this.addAll(entry.getKey(), entry.getValue());
        }
    }

    public final V getFirst(final K key) {
        if(!this.containsKey(key)) {
            return null;
        }

        return this.getMap().get(key).get(0);
    }

    public final List<V> getValues(K key) {
        return this.getMap().get(key);
    }

    public final boolean containsKey(K key) {
        return this.getMap().containsKey(key);
    }

    public final  boolean isEmpty() {
        return this.getMap().isEmpty();
    }

    public final List<V> remove(final K key) {
        if(!this.getMap().containsKey(key)) {
            return new ArrayList<V>();
        }

        List<V> removedList = new ArrayList<>();
        for (V value : this.getMap().get(key)) {
            removedList.add(value);
        }

        this.getMap().remove(key);

        return removedList;
    }

    public int size() {
        return this.getMap().size();
    }

    public Map<K, ArrayList<V>> getMap() {
        return map;
    }
}
