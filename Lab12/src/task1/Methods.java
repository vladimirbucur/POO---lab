package task1;

import java.util.Collection;
import java.util.ArrayList;

public class Methods implements Calculator{

    @Override
    public Double add(final Double nr1, final Double nr2) throws NullParameterException, OverflowException, UnderflowException{
        if(nr1 == null  || nr2 == null) {
            throw new NullParameterException();
        }
        if(nr1 + nr2 == Double.POSITIVE_INFINITY) {
            throw new OverflowException();
        }

        if(nr1 + nr2 == Double.NEGATIVE_INFINITY) {
            throw new UnderflowException();
        }
        return nr1 + nr2;
    }

    @Override
    public Double divide(final Double nr1, final Double nr2) throws NullParameterException, OverflowException, UnderflowException{
        if(nr1 == null  || nr2 == null) {
            throw new NullParameterException();
        }

        if(nr1 / nr2 == Double.POSITIVE_INFINITY) {
            throw new OverflowException();
        }

        if(nr1 / nr2 == Double.NEGATIVE_INFINITY) {
            throw new UnderflowException();
        }

        return nr1 / nr2;
    }

    @Override
    public Double average(final Collection<Double> numbers) throws OverflowException, UnderflowException{
        ArrayList<Double> nums = new ArrayList<>(numbers);
        double sum = 0;
        for(int  i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        if(sum == Double.POSITIVE_INFINITY) {
            throw new OverflowException();
        }

        if(sum == Double.NEGATIVE_INFINITY) {
            throw new UnderflowException();
        }
        return sum / nums.size() ;
    }
}
