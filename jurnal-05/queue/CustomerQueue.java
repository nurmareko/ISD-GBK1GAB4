import java.util.LinkedList;
import java.util.Queue;

public class CustomerQueue {
    private Queue<String> queueList;
    private int length;
    private int departed;

    public CustomerQueue() {
        queueList = new LinkedList<>();
        length = 0;
        departed = 0;
    }

    // Enqueue
    public void enqueue(String name) {
        length++;
        queueList.offer(name);
    }

    // Dequeue; return name
    public String dequeue() {
        length--;
        departed++;
        return queueList.poll();
    }

    // Print all
    public void printAll() {
        for (String people : queueList) {
            System.out.printf("%s ", people);
        }
        System.out.println();
    }

    // Get number of people who in the queue
    public int getLength() {
        return length;
    }

    // Get number of people who left the queue
    public int getDeparted() {
        return departed;
    }
}
