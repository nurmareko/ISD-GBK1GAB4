import java.util.ArrayList;
import java.util.Collections;

public class Inventory<E extends Comparable<? super E>> {
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

    public void displaySort() {
        Collections.sort(inventory);
        for (E item : inventory) {
            System.out.println(item + " ");
        }
    }

    public E getItem(int index) {
        return inventory.get(index);
    }

    public void setItem(E oldData, E newData) {
        int index = inventory.indexOf(oldData);
        inventory.set(index, newData);
    }

    public void removeItem(E item) {
        inventory.remove(item);
    }
}
