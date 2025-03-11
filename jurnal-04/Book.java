public class Book {
    private String isbn;
    private String title;
    private String category;
    private double price;
    private boolean hasLoan;

    // Constructor
    public Book(String isbn, String title, String category, double price, boolean hasLoan) {
        this.isbn = isbn;
        this.title = title;
        this.category = category;
        this.price = price;
        this.hasLoan = hasLoan;
    }

    // Getters and Setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategoty() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean  getHasLoan() {
        return hasLoan;
    }

    public void setHasLoan(boolean hasLoan) {
        this.hasLoan = hasLoan;
    }

    @Override
    public String toString() {
        return "Book{ISBN=" + isbn + ", title='" + title + "', category='" + category + "', price=" + price + ", hasLoan=" + hasLoan + "}";
    }
}
