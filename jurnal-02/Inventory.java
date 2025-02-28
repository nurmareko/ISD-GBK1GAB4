import java.util.ArrayList;

public class Inventory<E> {
    private final ArrayList<E> inventory;

    public Inventory() {
        inventory = new ArrayList<>(0);
    }

    public void add(E item) {
        inventory.add(item);
    }

    public void display() {
        for (E item : inventory) {
            System.out.println(item + " ");
        }
    }
}
