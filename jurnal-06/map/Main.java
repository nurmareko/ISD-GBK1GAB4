import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Player> roster = new HashMap<>();

        roster.put("8", new Player("Kazuma Kiryu", 51, "CF"));
        roster.put("1", new Player("Goro Majima", 55, "GK"));
        roster.put("10", new Player("Ichiban Kasuga", 42, "ST"));
        roster.put("6", new Player("Shun Akiyama", 42, "CDM"));

        System.out.println("Initial Mappings: " + roster);
    }
}
