package task1;

public class OutTask implements Task {
    String message;

    public OutTask(String message) {
        this.message = message;
    }

    public void execute() {
        System.out.println(message);
    }
}
