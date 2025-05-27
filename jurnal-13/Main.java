public class Main {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();

        tree.insertNode(111);
        tree.insertNode(90);
        tree.insertNode(150);
        tree.insertNode(80);
        tree.insertNode(100);
        tree.insertNode(130);
        tree.insertNode(170);
        tree.insertNode(95);
        tree.insertNode(140);

        System.out.printf("Inorder traversal:\n");
        tree.inorderTraversal();

        System.out.printf("Min: ");
        tree.findMin();
        System.out.printf("Max: ");
        tree.findMax();

        System.out.printf("Tree Depth: %d\n", tree.depth());

        System.out.printf("Searching for 80\n");
        tree.searchBST(80);
        System.out.printf("Searchingn for 100\n");
        tree.searchBST(100);
        System.out.printf("Searchingn for 200\n");
        tree.searchBST(200);
    }
}
