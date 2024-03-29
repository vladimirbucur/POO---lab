public class NotEnoughFundsException extends Exception {
    private final int id;
    private final double balance;
    private final double amount;

    public NotEnoughFundsException(int id, double balance, double amount, String message) {
        super(message);
        this.id = id;
        this.balance = balance;
        this.amount = Math.round(amount * 100) / 100d;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAmount() {
        return amount;
    }
}
