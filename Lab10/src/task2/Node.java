package task2;

public class Node<T extends Comparable<T>> {
    private T value;
    private Node<T> right;
    private Node<T> left;

    public Node(T value) {
        this.value = value;
    }

    // TODO: Generate constructor, getter and setters


    public T getValue() {
        return value;
    }

    public void setValue(final T value) {
        this.value = value;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(final Node<T> right) {
        this.right = right;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(final Node<T> left) {
        this.left = left;
    }
}
