package task1;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        DataRepository dataRepository = new DataRepository();

        long baseTimestamp = 10000;

        Scanner scanner = new Scanner(System.in);
        int taskNum = scanner.nextInt();

        switch (taskNum) {
            case 1:
                ConsoleLogger consoleLogger = new ConsoleLogger();
                ServerCommunicationController serverCommunicationController = new ServerCommunicationController();
                dataRepository.addObserver(consoleLogger);
                dataRepository.addObserver(serverCommunicationController);
                break;
            case 2:
                String first_strategy_type = scanner.next();
                String second_strategy_type = scanner.next();
                StepCountStrategy BasicStepCountStrategy = new BasicStepCountStrategy(dataRepository, first_strategy_type);
                StepCountStrategy FilteredStepCountStrategy = new FilteredStepCountStrategy(dataRepository, second_strategy_type);

                DataAggregator dataAggregator1 = new DataAggregator(BasicStepCountStrategy);
                DataAggregator dataAggregator2 = new DataAggregator(FilteredStepCountStrategy);

                dataRepository.addObserver(dataAggregator1);
                dataRepository.addObserver(dataAggregator2);

                break;
        }

        dataRepository.addData(new SensorData(10, baseTimestamp + 1));
        System.out.println();

        dataRepository.addData(new SensorData(20, baseTimestamp + 2));
        System.out.println();

        dataRepository.addData(new SensorData(30, baseTimestamp + 3));
        System.out.println();

        dataRepository.addData(new SensorData(4000, baseTimestamp + 4));
        System.out.println();

        dataRepository.addData(new SensorData(50, baseTimestamp + 5));
        System.out.println();

        dataRepository.addData(new SensorData(-100, baseTimestamp + 6));
        System.out.println();

        dataRepository.addData(new SensorData(500, baseTimestamp + 600));
        System.out.println();
    }
}
