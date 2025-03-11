import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Book> books = new LinkedList<>();
        books.add(new Book("9781975303112", "EIGHTY-SIX: Run Through the Battlefront", "military science fiction",
                15.00, false));
        books.add(new Book("9780394579153", "Learned Optimism", "self-help", 11.85, false));
        books.add(new Book("9787508313030", "The Mythical Man-Month", "software engineering", 26.49, false));
        books.addFirst(
                new Book("9780140435313", "Flatland: A Romance of Many Dimensions", "science fiction", 13.00, false));
        books.addFirst(new Book("9780671023379", "Man's Search For Meaning", "autobiography", 5.98, false));

        printAll(books);
        removeBook("9780394579153", books);
        removeBook("xxx", books);
        System.out.println("After remove");
        printAll(books);

    }

    // Remove a book; return true if successful
    public static boolean removeBook(String isbn, LinkedList<Book> books) {
        ListIterator<Book> iterator = books.listIterator();

        while (iterator.hasNext()) {
            Book current = iterator.next();
            if (current.getIsbn().equals(isbn)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    // Edit book's title; return true if successful
    public static boolean setTitle(String isbn) {
        return false;
    }

    // Edit book's loan status; return true if successful
    public static boolean setHasLoan(String isbn) {
        return false;
    }

    // Display all book in a list
    public static void printAll(LinkedList<Book> books) {
        ListIterator<Book> iterator = books.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Display all book in a list in reverse order (last entry to fist)
    public static void printAllReverse(LinkedList<Book> books) {
        ListIterator<Book> iterator = books.listIterator();

        while (iterator.hasNext()) {
            iterator.next();
        }

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
