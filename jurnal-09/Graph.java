import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class Graph {
    private HashMap<Character, ArrayList<Character>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addNode(char node, ArrayList<Character> neigbors) {
        adjacencyList.put(node, neigbors);
    }

    public void breadthFirstSearch(char origin) {
        Queue<Character> queue = new LinkedList<>();
        ArrayList<Character> visited = new ArrayList<>();
        ArrayList<Character> result = new ArrayList<>();

        queue.offer(origin);
        visited.add(origin);

        while (!queue.isEmpty()) {
            char current_vertex = queue.poll();

            // Add current vertex to result
            result.add(current_vertex);

            // Add current vertex valid neighbors to queue
            for (char neighbor : adjacencyList.get(current_vertex)) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        System.out.printf("Breath-First Search Path:\n");
        for (char node : result) {
            System.out.printf("%c ", node);
        }
        System.out.println();
    }

    public void depthFirstSearch(char origin) {

    }
}
