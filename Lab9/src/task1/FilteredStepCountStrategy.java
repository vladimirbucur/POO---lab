package task1;

public final class FilteredStepCountStrategy implements StepCountStrategy {
    private DataRepository dataRepository;
    private String strategyType;

    public FilteredStepCountStrategy(final DataRepository dataRepository, final String strategyType) {
        this.dataRepository = dataRepository;
        this.strategyType = strategyType;
    }

    @Override
    public int getTotalSteps() {
        int result = 0, prevStepCount = 0;
        for (SensorData sensorData : dataRepository.getDataArrayList()) {

            if (sensorData.getStepsCount() > 0 && sensorData.getStepsCount() - prevStepCount <= Utils.MAX_STEP_DIFFERENCE)
                result += sensorData.getStepsCount();

            prevStepCount = sensorData.getStepsCount();
        }
        return result;
    }

    @Override
    public String getStrategyDescription() {
        return  strategyType;
    }
}
