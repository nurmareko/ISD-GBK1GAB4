import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Order> laundry = new LinkedList<>();

        laundry.add(new Order(1, "Intan", 3, "biasa", 5));
        laundry.add(new Order(2, "Dudi", 4, "express", 3));
        laundry.add(new Order(3, "Ruli", 4, "kilat", 1));
        laundry.add(new Order(4, "Susi", 5, "biasa", 2));
        laundry.add(new Order(5, "Ira", 6, "biasa", 5));
        laundry.add(new Order(6, "Mayang", 7, "kilat", 4));

        Collections.sort(laundry);
        System.out.println(laundry);
    }
}
