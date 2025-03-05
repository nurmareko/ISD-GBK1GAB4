public class Singly<E> {
    private Node<E> head;
    private Node<E> tail;
    private String name;

    public Singly(String name) {
        head = tail = null;
        this.name = name;
    }

    public void insertHead(E item) {
        Node<E> newNode = new Node<E>(item);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertTail(E item) {
        Node<E> newNode = new Node<E>(item);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeHead() {
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeTail() {
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

        System.out.printf("=============== List: %s ===============\n", name);
        while (current != null) {
            System.out.printf("%s\n", current.data);
            current = current.next;
        }
        System.out.printf("================= List End ==================\n\n");
    }

    public void find(String name) {
        Node<E> current = head;

        while (current != null) {
            if (current.data instanceof Recipe) {
                Recipe recipe = (Recipe) current.data;
                if (recipe.getName().equals(name)) {
                    System.out.printf("%s: %s\n", this.name, current.data);
                    return;
                }
            }
            current = current.next;
        }
        System.out.printf("%s: %s not found :(\n", this.name, name);
        return;
    }

    private boolean isEmpty() {
        return head == null;
    }
}
