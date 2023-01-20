package task1;

import java.util.Observable;
import java.util.Observer;

public final class DataAggregator implements Observer {
    private StepCountStrategy strategy;

    public DataAggregator(final StepCountStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void update(final Observable o, final Object arg) {
        if (strategy.getStrategyDescription().equals("basic"))
            System.out.println("Basic strategy, total step count: : " + strategy.getTotalSteps());

        if(strategy.getStrategyDescription().equals("filtered"))
            System.out.println("Filtered strategy, total step count: : " + strategy.getTotalSteps());
    }
}
