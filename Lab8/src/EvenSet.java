import java.util.TreeSet;

public class EvenSet extends TreeSet<Integer> {
    @Override
    public boolean add(final Integer integer) {
        if (integer % 2 == 0) {
            return super.add(integer);
        }
        return false;
    }
}
