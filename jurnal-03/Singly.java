public class Singly<E> {
    private Node<E> head;
    private Node<E> tail;

    public Singly(){
        head = tail = null;
    }

    public void insertFront(E item) {
        node newNode = new Node(item);

        if (isEmpty()) {
            head = tail = new Node<E>(item);
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
}
