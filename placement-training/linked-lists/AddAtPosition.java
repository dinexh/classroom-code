public class AddAtPosition {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    private Node head;

    public void addFirst(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
    }

    public void addLast(int val) {
        Node n = new Node(val);
        if (head == null) { head = n; return; }
        Node cur = head;
        while (cur.next != null) cur = cur.next;
        cur.next = n;
    }

    public void addAtPosition(int pos, int val) {
        if (pos <= 0) { addFirst(val); return; }
        Node n = new Node(val);
        Node cur = head;
        int idx = 0;
        while (cur != null && idx < pos - 1) {
            cur = cur.next;
            idx++;
        }
        if (cur == null) { addLast(val); return; }
        n.next = cur.next;
        cur.next = n;
    }

    public void printList() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data);
            if (cur.next != null) System.out.print(" -> ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AddAtPosition ll = new AddAtPosition();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(4);
        System.out.print("Before insert: ");
        ll.printList();
        ll.addAtPosition(2, 3); // insert 3 at index 2 (0-based)
        System.out.print("After insert at pos 2: ");
        ll.printList();
        ll.addAtPosition(0, 0);
        System.out.print("After insert at pos 0: ");
        ll.printList();
    }
}
