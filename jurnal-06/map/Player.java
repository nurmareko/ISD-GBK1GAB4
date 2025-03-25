public class Player {
    private String name;
    private int age;
    private String position;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + age + ", " + position + "}";
    }
}
