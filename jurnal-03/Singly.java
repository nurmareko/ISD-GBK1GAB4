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

    public void insertBack(E item) {
        Node newNode = new Node(item);

        if (isEmpty()) {
            head = tail = new Node<E>(item);
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeFront() {
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeBack() {
        if (head == tail) {
            head = tail = null;
        } else {
            Node<E> current = head;

            while (current.next != tail) {
                current = current.next;
            }

            tail = current;
            current.next = null;
        }
    }

    private void print() {
        Node<E> current = head;

        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.next;
        }
        System.out.println();
    }

    private boolean isEmpty() {
        return head == null;
    }
}
