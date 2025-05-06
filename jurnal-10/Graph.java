import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class Graph {
    private HashMap<String, ArrayList<String>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addNode(String node, ArrayList<String> neigbors) {
        adjacencyList.put(node, neigbors);
    }

    // Topological sort using Khan's algorithm
    public void topologicalSort() {
        ArrayList<String> result = new ArrayList<>();
        HashMap<String, Integer> predCount = new HashMap<>();
        Queue<String> queue = new LinkedList<>();

        // Initialize predecessor count with zero.
        for (String node : adjacencyList.keySet()) {
            predCount.put(node, 0);
        }

        // Count predecessor for each node
        for (String node : adjacencyList.keySet()) {
            for (String neighbor : adjacencyList.get(node)) {
                int count = predCount.get(neighbor);
                predCount.put(neighbor, count + 1);
            }
        }

        // Initialize queue
        for (String node : predCount.keySet()) {
            if (predCount.get(node) == 0) {
                queue.add(node);
            }
        }

        while (!queue.isEmpty()) {
            String current = queue.poll();
            result.add(current);

            for (String neighbor : adjacencyList.get(current)) {
                int count = predCount.get(neighbor);
                predCount.put(neighbor, count - 1);

                if (predCount.get(neighbor) == 0) {
                    queue.add(neighbor);
                }
            }
        }

        System.out.printf("Topological Order:\n");
        for (String node : result) {
            System.out.printf("[%s] ", node);
        }
        System.out.println();
    }
}
