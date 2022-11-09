package task1;

public class CounterOutTask implements Task{
    static int counter;

    public void execute() {
        counter++;
        System.out.println(counter);
    }
}

