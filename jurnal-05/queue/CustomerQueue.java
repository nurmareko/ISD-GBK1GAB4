import java.util.LinkedList;
import java.util.Queue;

public class CustomerQueue {
    private Queue<String> queueList;
    private int departed;

    public CustomerQueue() {
        queueList = new LinkedList<>();
        departed = 0;
    }

    // Print all
    public String printAll() {
        return "";
    }

    // Get number of people who in the queue
    public int getLength() {
        return 0;
    }

    // Get number of people who left the queue
    public int getDeparted() {
        return 0;
    }
}
