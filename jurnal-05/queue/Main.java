
public class Main {
    public static void main(final String args[]) {
        CustomerQueue customers = new CustomerQueue();

        // Add customers to queue
        customers.enqueue("Date");
        customers.enqueue("Aiba");
        customers.enqueue("Mizuki");

        System.out.printf("initial queue: ");
        customers.printAll();

        // Remove customers from queue
        System.out.printf("%s left the queue.\n", customers.dequeue());

        // Print queue
        System.out.printf("current queue: ");
        customers.printAll();

        // Print number of customer in queue
        System.out.printf("in queue: %d\n", customers.getLength());

        // Print number of customer who left queue
        System.out.printf("departed: %d\n", customers.getDeparted());
    }
}
