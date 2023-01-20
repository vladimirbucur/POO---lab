package task2;

import task1.Task;
import java.util.ArrayList;

public class Queue implements Container{
    ArrayList<Task> listQueue = new ArrayList<Task>();

    public Task pop() {
        Task task = listQueue.get(0);
        listQueue.remove(0);
        return task;
    }

    public void push(Task taskQueue) {
        listQueue.add(taskQueue);
    }

    public int size() {
        return listQueue.size();
    }

    public boolean isEmpty() {
        if (listQueue.size() != 0)
            return false;

        return true;
    }

    public void transferFrom(Container container) {
        while (!container.isEmpty()) {
            Task transferredTask = container.pop();
            listQueue.add(transferredTask);
        }
    }

    public ArrayList<Task> getTasks() {
        return listQueue;
    }
}
