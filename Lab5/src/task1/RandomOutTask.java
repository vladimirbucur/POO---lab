package task1;

import java.util.Random;

public class RandomOutTask implements Task {
    static Random random = new Random(12345);
    int rnd;

    public RandomOutTask() {
        this.rnd = random.nextInt();
    }

    public void execute() {
        System.out.println(rnd);
    }
}
