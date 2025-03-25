public class HashSet {
    private Node[] buckets;

    public HashSet(int size) {
        buckets = new Node[size];
    }

    public int hash(String str) {
        int hashed = str.hashCode();
        if (hashed < 0) {
            hashed = -hashed;
        }
        return hashed % buckets.length;
    }

    public boolean contains(String str) {
        Node iterator = buckets[hash(str)];

        while (iterator != null) {
            if (iterator.data.equals(str)) {
                return true;
            }
            iterator = iterator.next;
        }
        return false;
    }

    public boolean add(String str) {
        int hashed = hash(str);
        Node iterator = buckets[hashed];

        if (iterator != null) {
            if (contains(str)) {
                return false;
            }
        }

        Node newNode = new Node(str);
        if (iterator == null) {
            buckets[hashed] = newNode;
        } else {
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = newNode;
        }
        return true;
    }

    public void print() {
        for (int i = 0; i < buckets.length; i++) {
            Node iterator = buckets[i];
            if (iterator != null) {
                System.out.printf("index %d :", i);
                while (iterator != null) {
                    System.out.printf("%s ", iterator.data);
                    iterator = iterator.next;
                }
                System.out.println();
            }
        }
    }
}
