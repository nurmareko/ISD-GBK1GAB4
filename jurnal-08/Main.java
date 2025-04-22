public class Main {
    public static void main(String[] args) {
        AdjacencyMatrix graph = new AdjacencyMatrix(5);

        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 2);
        graph.addEdge(4, 3);
        graph.addEdge(4, 5);
        graph.addEdge(5, 1);

        graph.printMatrix();
        System.out.println();
        graph.printList();
    }
}
