public class SimpleCircularLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    private Node tail;

    public void addLast(int val) {
        Node n = new Node(val);
        if (tail == null) { n.next = n; tail = n; return; }
        n.next = tail.next;
        tail.next = n;
        tail = n;
    }

    public void printList() {
        if (tail == null) {
            System.out.println();
            return;
        }
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
        SimpleCircularLinkedList cll = new SimpleCircularLinkedList();
        cll.addLast(10);
        cll.addLast(20);
        cll.addLast(30);
        System.out.print("Simple circular list: ");
        cll.printList();
    }
}
