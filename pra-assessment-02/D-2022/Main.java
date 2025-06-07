import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Graph cities = new Graph();

        cities.addNode("London", new ArrayList<>(Arrays.asList("Birmingham", "Salisbury")));
        cities.addNode("Salisbury", new ArrayList<>(Arrays.asList("Bristol", "London")));
        cities.addNode("Bristol", new ArrayList<>(Arrays.asList("Birmingham", "Salisbury")));
        cities.addNode("Birmingham",
                new ArrayList<>(Arrays.asList("Bristol", "Cardiff", "Liverpool", "London", "Kingston")));
        cities.addNode("Cardiff", new ArrayList<>(Arrays.asList("Birmingham")));
        cities.addNode("Manchester",
                new ArrayList<>(Arrays.asList("Birmingham", "Glasgow", "Kingston", "Liverpool", "Newcastle")));
        cities.addNode("Kingston", new ArrayList<>(Arrays.asList("Birmingham", "Manchester", "Newcastle")));
        cities.addNode("Liverpool", new ArrayList<>(Arrays.asList("Manchester")));
        cities.addNode("Newcastle", new ArrayList<>(Arrays.asList("Edinburgh", "Kingston", "Manchester")));
        cities.addNode("Edinburgh", new ArrayList<>(Arrays.asList("Glasgow", "Newcastle")));
        cities.addNode("Glasgow", new ArrayList<>(Arrays.asList("Edinburgh", "Manchester")));

        cities.breadthFirstSearch("London");
        System.out.println();
        cities.depthFirstSearch("London");
    }
}
