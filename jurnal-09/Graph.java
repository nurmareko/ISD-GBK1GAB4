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
            char current_node = queue.poll();

            // Add current node to result
            result.add(current_node);

            // Add current node valid neighbors to queue
            for (char neighbor : adjacencyList.get(current_node)) {
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
        Stack<Character> stack = new Stack<>();
        ArrayList<Character> visited = new ArrayList<>();
        ArrayList<Character> result = new ArrayList<>();

        stack.push(origin);
        visited.add(origin);

        while (!stack.isEmpty()) {
            char current_node = stack.pop();

            // Add current node to result
            result.add(current_node);

            // Add current node valid neighbors to stack
            for (char neighbor : adjacencyList.get(current_node)) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        System.out.printf("Depth-First Search Path:\n");
        for (char node : result) {
            System.out.printf("%c ", node);
        }
        System.out.println();
    }
}
