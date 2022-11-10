package task2;

import task1.Task;
import java.util.ArrayList;

public class Stack implements Container{
    ArrayList<Task> listStack = new ArrayList<Task>();

    public Task pop() {
        Task task = listStack.get(listStack.size() - 1);
        listStack.remove(listStack.size() - 1);
        return task;
    }

    public void push(Task task) {
        listStack.add(task);
    }

    public int size() {
        return listStack.size();
    }

    public boolean isEmpty() {
        if (listStack.size() != 0)
            return false;

        return true;
    }

    public void transferFrom(Container container) {
        while (!container.isEmpty()) {
            Task transferredTask = container.pop();
            listStack.add(transferredTask);
        }
    }

    public ArrayList<Task> getTasks() {
        return listStack;
    }
}
