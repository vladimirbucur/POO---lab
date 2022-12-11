import java.util.HashSet;

public class TreeEvenSet extends HashSet<Integer> {
    @Override
    public boolean add(final Integer integer) {
        if (integer % 2 == 0) {
            return super.add(integer);
        }
        return false;
    }
}
