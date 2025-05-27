public class TreeNode<E extends Comparable<E>> {
    private E data;
    private TreeNode<E> leftNode;
    private TreeNode<E> rightNode;

    public TreeNode(E data) {
        this.data = data;
        leftNode = null;
        rightNode = null;
    }

    public E getData() {
        return data;
    }

    public TreeNode<E> getLeftNode() {
        return leftNode;
    }

    public TreeNode<E> getRightNode() {
        return rightNode;
    }

    public void insert(E data) {
        if (data.compareTo(this.data) < 0) {
            if (leftNode == null) {
                leftNode = new TreeNode<E>(data);
            } else {
                leftNode.insert(data);
            }
        } else if (data.compareTo(this.data) > 0) {
            if (rightNode == null) {
                rightNode = new TreeNode<E>(data);
            } else {
                rightNode.insert(data);
            }
        }
    }
}
