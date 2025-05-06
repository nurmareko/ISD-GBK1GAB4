import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // graph.addNode('A', new ArrayList<>(Arrays.asList('B', 'D', 'E')));
        // graph.addNode('B', new ArrayList<>(Arrays.asList('C', 'E', 'G')));
        // graph.addNode('C', new ArrayList<>(Arrays.asList('G')));
        // graph.addNode('D', new ArrayList<>(Arrays.asList('E')));
        // graph.addNode('E', new ArrayList<>(Arrays.asList('F')));
        // graph.addNode('F', new ArrayList<>());
        // graph.addNode('G', new ArrayList<>(Arrays.asList('F')));
        // graph.addNode('Z', new ArrayList<>());

        graph.addNode("Hologram", new ArrayList<>(Arrays.asList("Kostum")));
        graph.addNode("Kostum",
                new ArrayList<>(Arrays.asList("Pencahayaan", "Pengepasan kostum", "Pembuatan panggung")));
        graph.addNode("Pencahayaan", new ArrayList<>());
        graph.addNode("Pengepasan kostum", new ArrayList<>());
        graph.addNode("Kontak tim lain", new ArrayList<>(Arrays.asList("Pengepasan kostum", "Persiapan panggung")));
        graph.addNode("Pembuatan panggung", new ArrayList<>());
        graph.addNode("Persiapan panggung", new ArrayList<>(Arrays.asList("Pembuatan panggung")));
        graph.addNode("Properti panggung", new ArrayList<>(Arrays.asList("Kostum", "Persiapan panggung")));

        // graph.breadthFirstSearch("Hologram");
        // System.out.println();
        // graph.depthFirstSearch("Hologram");
        // System.out.println();
        graph.topologicalSort();
    }
}
