public class Order implements Comparable<Order> {
    private int id;
    private String name;
    private int date;
    private String type;
    private int weight;
    private int dateEnd;

    public Order(int id, String name, int date, String type, int weight) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.type = type;
        this.weight = weight;
        dateEnd = date + getValue(type);
    }

    private int getValue(String type) {
        switch (type) {
            case "biasa":
                return 3;
            case "express":
                return 2;
            default:
                return 1;
        }
    }

    @Override
    public int compareTo(Order other) {
        return Integer.compare(this.dateEnd, other.dateEnd);
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
