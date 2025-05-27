public class Tree<E extends Comparable<E>> {
    private TreeNode<E> root;

    public Tree() {
        root = null;
    }

    public void insertNode(E data) {
        if (root == null) {
            root = new TreeNode<>(data);
        } else {
            root.insert(data);
        }
    }

    public void inorderTraversal() {
        inorderTraversal(root);
        System.out.println();
    }

    private void inorderTraversal(TreeNode<E> node) {
        if (node == null) {
            return;
        } else {
            inorderTraversal(node.getLeftNode());
            System.out.print(node.getData() + " ");
            inorderTraversal(node.getRightNode());
        }
    }

    public void findMin() {
        TreeNode<E> node = root;

        while (node.getLeftNode() != null) {
            node = node.getLeftNode();
        }

        System.out.printf("%s\n", node.getData());
    }

    public void findMax() {
        TreeNode<E> node = root;

        while (node.getRightNode() != null) {
            node = node.getRightNode();
        }

        System.out.printf("%s\n", node.getData());
    }

    public int depth() {
        return depth(root);
    }

    private int depth(TreeNode<E> root) {
        if (root == null) {
            return 0;
        }
        int lHeight = depth(root.getLeftNode());
        int rHeight = depth(root.getRightNode());
        return Math.max(lHeight, rHeight) + 1;
    }

    public void searchBST(E key) {
        boolean hasil = searchBST(root, key);
        if (hasil)
            System.out.println(key + " found.");
        else
            System.out.println(key + " not found.");
    }

    public boolean searchBST(TreeNode<E> node, E key) {
        boolean result = false;
        if (node != null) {
            if (key.equals(node.getData()))
                result = true;
            else if (key.compareTo(node.getData()) < 0)
                result = searchBST(node.getLeftNode(), key);
            else
                result = searchBST(node.getRightNode(), key);
        }
        return result;
    }

}
