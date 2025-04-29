import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graph {
    private HashMap<Character, ArrayList<Character>> AdjacencyList;

    public Graph() {
        AdjacencyList = new HashMap<>();
    }

    public void addNode(char node, ArrayList<Character> neigbors) {
        AdjacencyList.put(node, neigbors);
    }

    public void breadthFirstSearch(char origin) {
        // ArrayList<Character> result = new ArrayList<>(Arrays.asList('A', 'B', 'C'));

        System.out.printf("Breath-First Search Path:\n");
        for (char node : result) {
            System.out.printf("%c ", node);
        }
        System.out.println();
    }

    public void DepthFirstSearch() {

    }
}
