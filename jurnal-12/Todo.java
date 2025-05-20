public class Todo implements Comparable<Todo> {
    private int deadline; // Deadline in day
    private String task;

    public Todo(int deadline, String task) {
        this.deadline = deadline;
        this.task = task;
    }

    @Override
    public int compareTo(Todo other) {
        return Integer.compare(this.deadline, other.deadline);
    }

    @Override
    public String toString() {
        return task;
    }
}
