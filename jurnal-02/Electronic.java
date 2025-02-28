public class Electronic {
    private String id;
    private String name;
    private String category;
    private String price;
    private int stock;

    public Electronic(String id, String name, String category, String price, int stock) {
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

    @Override
    public String toString() {
        return "Electronic [" +
                " id:" + id +
                " name:" + name +
                " category:" + category +
                " price:" + price +
                " stock:" + stock +
                "]";
    }
}
