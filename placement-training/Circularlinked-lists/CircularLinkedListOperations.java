public class CircularLinkedListOperations {
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
        tail = tail.next;
    }

    public void addAtPosition(int pos, int val) {
        if (pos <= 0 || tail == null) { addFirst(val); return; }
        Node cur = tail.next;
        int idx = 0;
        while (idx < pos - 1 && cur != tail) { cur = cur.next; idx++; }
        Node n = new Node(val);
        n.next = cur.next;
        cur.next = n;
        if (cur == tail) tail = n;
    }

    public void deleteAtPosition(int pos) {
        if (tail == null) return;
        Node head = tail.next;
        if (pos <= 0) {
            if (head == tail) { tail = null; return; }
            tail.next = head.next;
            return;
        }
        Node cur = head;
        int idx = 0;
        while (idx < pos - 1 && cur.next != head) { cur = cur.next; idx++; }
        if (cur.next == head) return;
        if (cur.next == tail) { cur.next = cur.next.next; tail = cur; }
        else cur.next = cur.next.next;
    }

    public boolean search(int val) {
        if (tail == null) return false;
        Node start = tail.next;
        Node cur = start;
        do {
            if (cur.data == val) return true;
            cur = cur.next;
        } while (cur != start);
        return false;
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
        CircularLinkedListOperations cll = new CircularLinkedListOperations();
        cll.addLast(5);
        cll.addFirst(3);
        cll.addAtPosition(1, 4);
        cll.addLast(7);
        System.out.print("Circular list after inserts: ");
        cll.printList();
        System.out.println("Search 4: " + cll.search(4));
        cll.deleteAtPosition(1);
        System.out.print("After delete at pos 1: ");
        cll.printList();
    }
}
