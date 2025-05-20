import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Todo> taskList = new PriorityQueue<>();

        // insert data
        taskList.add(new Todo(5, "tugas ISD"));
        taskList.add(new Todo(8, "rapat UKM"));
        taskList.add(new Todo(3, "kuis SBD"));

        System.out.printf("Task terdekat yang harus diselesaikan: %s\n", taskList.peek());
        System.out.printf("%s selesai dilaksanakan, berikutnya %s\n", taskList.poll(), taskList.peek());

    }
}
