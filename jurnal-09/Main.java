import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addNode('A', new ArrayList<>(Arrays.asList('B', 'C', 'H')));
        graph.addNode('B', new ArrayList<>(Arrays.asList('A', 'D')));
        graph.addNode('C', new ArrayList<>(Arrays.asList('A', 'G')));
        graph.addNode('D', new ArrayList<>(Arrays.asList('B', 'E')));
        graph.addNode('E', new ArrayList<>(Arrays.asList('D', 'F')));
        graph.addNode('F', new ArrayList<>(Arrays.asList('E', 'G')));
        graph.addNode('G', new ArrayList<>(Arrays.asList('C', 'F')));
        graph.addNode('H', new ArrayList<>(Arrays.asList('A')));

        graph.breadthFirstSearch('A');
    }
}
