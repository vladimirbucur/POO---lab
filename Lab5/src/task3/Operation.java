package task3;

public class Operation implements Minus, Plus, Mult, Div {
    float value;

    public float getNumber() {
        return this.value;
    }

    public Operation(float value) {
        this.value = value;
    }

    public void minus(float value) {
        this.value -= value;
    }

    public void plus(float value) {
        this.value += value;
    }

    public void mult(float value) {
        this.value *= value;
    }

    public void div(float value) {
        if (value == 0)
            System.out.println("Division by zero is not possible");
        else
            this.value /= value;
    }
}
