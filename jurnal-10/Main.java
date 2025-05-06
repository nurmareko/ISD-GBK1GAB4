import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addNode("Hologram", new ArrayList<>(Arrays.asList("Kostum")));
        graph.addNode("Kostum",
                new ArrayList<>(Arrays.asList("Pencahayaan", "Pengepasan kostum", "Pembuatan panggung")));
        graph.addNode("Pencahayaan", new ArrayList<>());
        graph.addNode("Pengepasan kostum", new ArrayList<>());
        graph.addNode("Kontak tim lain", new ArrayList<>(Arrays.asList("Pengepasan kostum", "Persiapan panggung")));
        graph.addNode("Pembuatan panggung", new ArrayList<>());
        graph.addNode("Persiapan panggung", new ArrayList<>(Arrays.asList("Pembuatan panggung")));
        graph.addNode("Properti panggung", new ArrayList<>(Arrays.asList("Kostum", "Persiapan panggung")));

        graph.topologicalSort();
    }
}
