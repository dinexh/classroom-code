public class SimpleLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    private Node head;

    public void addLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        Node cur = head;
        while (cur.next != null) cur = cur.next;
        cur.next = node;
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
        SimpleLinkedList ll = new SimpleLinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        System.out.print("Simple list: ");
        ll.printList();
    }
}
