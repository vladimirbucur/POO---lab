package task1;

public final class BasicStepCountStrategy implements StepCountStrategy {
    private DataRepository dataRepository;
    private String strategyType;

    public BasicStepCountStrategy(final DataRepository dataRepository, final String strategyType) {
        this.dataRepository = dataRepository;
        this.strategyType = strategyType;
    }

    @Override
    public int getTotalSteps() {
        int result = 0;
        for (SensorData sensorData : dataRepository.getDataArrayList()) {
            result += sensorData.getStepsCount();
        }
        return result;
    }

    @Override
    public String getStrategyDescription() {
        return  strategyType;
    }
}
