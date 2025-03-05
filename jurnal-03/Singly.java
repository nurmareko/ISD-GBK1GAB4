public class Singly<E> {
    private Node<E> head;
    private Node<E> tail;
    private String name;

    public Singly(String name) {
        head = tail = null;
        this.name = name;
    }

    public void insertFront(E item) {
        Node<E> newNode = new Node<E>(item);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertBack(E item) {
        Node<E> newNode = new Node<E>(item);

        if (isEmpty()) {
            head = tail = newNode;
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

    public void printAll() {
        Node<E> current = head;

        System.out.printf("=== List: %s ===\n", name);
        System.out.printf("====== End ======\n");
        while (current != null) {
            System.out.printf("%s\n", current.data);
            current = current.next;
        }
        System.out.println("==== List End ====");
    }

    public E find(String name) {
        Node<E> current = head;

        while (current != null) {
            if (current.data instanceof Recipe) {
                Recipe recipe = (Recipe) current.data;
                if (recipe.getName().equals(name)) {
                    return current.data;
                }
            }
            current = current.next;
        }
        return null;
    }

    private boolean isEmpty() {
        return head == null;
    }
}
