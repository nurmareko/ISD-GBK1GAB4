public class Traditional {
    private String id;
    private String name;
    private String category;
    private String price;
    private int stock;

    public Traditional(String id, String name, String category, String price, int stock) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
