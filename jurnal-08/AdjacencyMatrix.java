public class AdjacencyMatrix {
    int n;
    boolean[][] matrix;

    public AdjacencyMatrix(int n) {
        this.n = n;
        matrix = new boolean[n][n];
    }

    public void addEdge(int i, int j) {
        matrix[i - 1][j - 1] = true;
    }

    public void printMatrix() {
        for (boolean[] row : matrix) {
            for (boolean val : row) {
                System.out.printf("%b\t", val);
            }
            System.out.println();
        }
    }

    public void printList() {
        System.out.printf("Vertex\tNeighbors\n");

        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%d\t", i + 1);

            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j]) {
                    System.out.printf("%d ", j + 1);
                }
            }

            System.out.println();
        }

        System.out.println();
    }
}
