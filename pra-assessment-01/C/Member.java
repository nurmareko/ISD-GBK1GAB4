public class Member {
    private String phone;
    private String name;
    private String address;
    private String type;
    private int year;

    public Member(String phone, String name, String address, String type, int year) {
        this.phone = phone;
        this.name = name;
        this.address = address;
        this.type = type;
        this.year = year;
    }

    @Override
    public String toString() {
        return "{" + phone + " " + name + " " + address + " " + type + " " + year + "}";
    }
}
