public class Order implements Comparable<Order> {
    private int id;
    private String name;
    private int date; // In day of a month
    private String type;
    private String address;
    private int dateEnd;

    public Order(int id, String name, int date, String type, String address) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.type = type;
        this.address = address;
        dateEnd = date + getTypeValue(type);
    }

    private int getTypeValue(String type) {
        switch (type) {
            case "biasa":
                return 3;
            case "express":
                return 2;
            case "kilat":
                return 1;
            default:
                return 0;
        }
    }

    @Override
    public int compareTo(Order other) {
        return Integer.compare(this.dateEnd, other.dateEnd);
    }

    @Override
    public String toString() {
        return "ID:" + id + " name:" + name + " address: " + address;
    }
}
