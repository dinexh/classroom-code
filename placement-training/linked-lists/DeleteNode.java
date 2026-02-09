public class DeleteNode {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    private Node head;

    public void addLast(int val) {
        Node n = new Node(val);
        if (head == null) { head = n; return; }
        Node cur = head;
        while (cur.next != null) cur = cur.next;
        cur.next = n;
    }

    public void deleteAtPosition(int pos) {
        if (head == null) return;
        if (pos <= 0) { head = head.next; return; }
        Node cur = head;
        int idx = 0;
        while (cur.next != null && idx < pos - 1) {
            cur = cur.next;
            idx++;
        }
        if (cur.next != null) cur.next = cur.next.next;
    }

    public void deleteByValue(int val) {
        if (head == null) return;
        while (head != null && head.data == val) head = head.next;
        Node cur = head;
        while (cur != null && cur.next != null) {
            if (cur.next.data == val) cur.next = cur.next.next;
            else cur = cur.next;
        }
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
        DeleteNode ll = new DeleteNode();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        System.out.print("Original: ");
        ll.printList();
        ll.deleteAtPosition(2);
        System.out.print("After delete at pos 2: ");
        ll.printList();
        ll.deleteByValue(2);
        System.out.print("After delete by value 2: ");
        ll.printList();
    }
}
