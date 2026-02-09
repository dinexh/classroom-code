public class LinkedListOperations {
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
        while (cur != null && idx < pos - 1) { cur = cur.next; idx++; }
        if (cur == null) { addLast(val); return; }
        n.next = cur.next;
        cur.next = n;
    }

    public void deleteAtPosition(int pos) {
        if (head == null) return;
        if (pos <= 0) { head = head.next; return; }
        Node cur = head;
        int idx = 0;
        while (cur.next != null && idx < pos - 1) { cur = cur.next; idx++; }
        if (cur.next != null) cur.next = cur.next.next;
    }

    public boolean search(int val) {
        Node cur = head;
        while (cur != null) {
            if (cur.data == val) return true;
            cur = cur.next;
        }
        return false;
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
        LinkedListOperations ll = new LinkedListOperations();
        ll.addLast(5);
        ll.addFirst(3);
        ll.addAtPosition(1, 4);
        ll.addLast(7);
        System.out.print("List after inserts: ");
        ll.printList();
        System.out.println("Search 4: " + ll.search(4));
        ll.deleteAtPosition(1);
        System.out.print("After delete at pos 1: ");
        ll.printList();
    }
}
