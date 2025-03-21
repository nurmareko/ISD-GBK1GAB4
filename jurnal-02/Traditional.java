public class Traditional implements Comparable<Traditional> {
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

    @Override
    public String toString() {
        return "Traditional [" +
                " id:" + id +
                " name:" + name +
                " category:" + category +
                " price:" + price +
                " stock:" + stock +
                "]";
    }

    @Override
    public int compareTo(Traditional o) {
        return this.getId().compareTo(o.getId());
    }
}
