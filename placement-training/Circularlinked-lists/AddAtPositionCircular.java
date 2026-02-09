public class AddAtPositionCircular {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    private Node tail;

    public void addFirst(int val) {
        Node n = new Node(val);
        if (tail == null) { n.next = n; tail = n; return; }
        n.next = tail.next;
        tail.next = n;
    }

    public void addLast(int val) {
        addFirst(val);
        tail = tail.next; // new node becomes tail
    }

    public void addAtPosition(int pos, int val) {
        if (pos <= 0 || tail == null) { addFirst(val); return; }
        Node cur = tail.next; // head
        int idx = 0;
        while (idx < pos - 1 && cur != tail) {
            cur = cur.next;
            idx++;
        }
        Node n = new Node(val);
        n.next = cur.next;
        cur.next = n;
        if (cur == tail) tail = n;
    }

    public void printList() {
        if (tail == null) { System.out.println(); return; }
        Node start = tail.next;
        Node cur = start;
        do {
            System.out.print(cur.data);
            cur = cur.next;
            if (cur != start) System.out.print(" -> ");
        } while (cur != start);
        System.out.println();
    }

    public static void main(String[] args) {
        AddAtPositionCircular cll = new AddAtPositionCircular();
        cll.addLast(1);
        cll.addLast(2);
        cll.addLast(4);
        System.out.print("Before insert: ");
        cll.printList();
        cll.addAtPosition(2, 3);
        System.out.print("After insert at pos 2: ");
        cll.printList();
        cll.addAtPosition(0, 0);
        System.out.print("After insert at pos 0: ");
        cll.printList();
    }
}
