public class Node<E> {
    private E data;
    private Node<E> left, right;

    public Node() {
        data = null;
        left = null;
        right = null;
    }

    public Node(E data) {
        this.data = data;
        left = null;
        right = null;
    }

    public E getData() {
        return this.data;
    }

    public Node<E> getLeft() {
        return left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }

    public void setData(E data) {
        this.data = data;
    }
}
