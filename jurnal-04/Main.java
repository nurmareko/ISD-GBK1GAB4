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

        // Display all book
        System.out.println("Display initial list:");
        printAll(books);
        System.out.println();

        // Add a book to list
        System.out.println("After adding 'Bumi':");
        books.add(new Book("9786020301129", "Bumi", "fantasy", 3.00, false));
        printAll(books);
        System.out.println();

        // Delete a book from a list
        System.out.println("After deleting 'Flatland':");
        removeBook("9780140435313", books);
        printAll(books);
        System.out.println();

        // Edit last book
        System.out.println("Edit the last book; edit title:");
        ListIterator<Book> iterator = books.listIterator();
        Book current = new Book();
        while (iterator.hasNext()) {
            current = iterator.next();
        }
        current.setTitle("Bumi: Tere Lye Series");
        printAll(books);
        System.out.println();

        // Edit second to last
        System.out.println("Edit the second to last book; edit loan status:");
        current = iterator.previous();
        current = iterator.previous();
        current.setHasLoan(true);
        printAll(books);
        System.out.println();

        // Display all book in reverse order
        System.out.println("Display list in reverse order:");
        printAllReverse(books);
        System.out.println();
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
    public static boolean setTitle(String newTitle, String isbn, LinkedList<Book> books) {
        ListIterator<Book> iterator = books.listIterator();

        while (iterator.hasNext()) {
            Book current = iterator.next();
            if (current.getIsbn().equals(isbn)) {
                current.setTitle(newTitle);
                return true;
            }
        }
        return false;
    }

    // Edit book's loan status; return true if successful
    public static boolean setHasLoan(boolean newHasLoan, String isbn, LinkedList<Book> books) {
        ListIterator<Book> iterator = books.listIterator();

        while (iterator.hasNext()) {
            Book current = iterator.next();
            if (current.getIsbn().equals(isbn)) {
                current.setHasLoan(newHasLoan);
                return true;
            }
        }
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
