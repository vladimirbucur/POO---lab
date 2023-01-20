package task2;

import java.util.HashSet;
import java.util.List;

public class TreeImpl<T extends Comparable<T>> implements Tree<T> {
    private int size;
    private Node<T> root;


    public TreeImpl() {
        this.size = 0;
        this.root = null;
    }

    @Override
    public void addValue(final T value) {
        this.setRoot(addValue(this.getRoot(), value));
        size++;
    }

    private Node<T> addValue(final Node<T> node, final T value) {
        if (node == null) {
            return new Node<>(value);
        }

        int compare = value.compareTo(node.getValue());
        if (compare > 0) {
            node.setRight(addValue(node.getRight(), value));
        } else {
            node.setLeft(addValue(node.getRight(), value));
        }

        return node;
    }

    @Override
    public void addAll(final List<T> values) {
        for (T value : values) {
            this.addValue(value);
        }
    }

    public final void inorderTraversal(final Node<T> node, final HashSet<T> hashSetValues, final T inf, final T sup) {
        if (node != null) {
            inorderTraversal(node.getLeft(), hashSetValues, inf, sup);
            if (node.getValue().compareTo(inf) >= 0 && node.getValue().compareTo(sup) <= 0) {
                hashSetValues.add(node.getValue());
            }
            inorderTraversal(node.getRight(), hashSetValues, inf, sup);
        }
    }

    @Override
    public HashSet<T> getValues(final T inf, final T sup) {
        HashSet<T> hashSetValues = new HashSet<>();
        inorderTraversal(this.getRoot(), hashSetValues, inf, sup);
        return hashSetValues;
    }

    @Override
    public int size() {
        return this.getSize();
    }

    @Override
    public boolean isEmpty() {
        if (this.getSize() == 0)
            return true;
        return false;
    }

    public int getSize() {
        return size;
    }

    public void setSize(final int size) {
        this.size = size;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(final Node<T> root) {
        this.root = root;
    }
}
