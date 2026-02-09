public class DeleteNodeCircular {
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
        while (idx < pos - 1 && cur.next != head) {
            cur = cur.next;
            idx++;
        }
        if (cur.next == head) return; // position out of range
        if (cur.next == tail) {
            cur.next = tail.next;
            tail = cur;
        } else {
            cur.next = cur.next.next;
        }
    }

    public void deleteByValue(int val) {
        if (tail == null) return;
        Node head = tail.next;
        // remove matching head nodes
        while (head != null && head.data == val) {
            if (head == tail) { tail = null; return; }
            tail.next = head.next;
            head = tail.next;
        }
        Node cur = head;
        if (cur == null) return;
        while (cur.next != head) {
            if (cur.next.data == val) {
                if (cur.next == tail) { cur.next = cur.next.next; tail = cur; break; }
                cur.next = cur.next.next;
            } else cur = cur.next;
        }
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
        DeleteNodeCircular cll = new DeleteNodeCircular();
        cll.addLast(1);
        cll.addLast(2);
        cll.addLast(3);
        cll.addLast(2);
        System.out.print("Original: ");
        cll.printList();
        cll.deleteAtPosition(2);
        System.out.print("After delete at pos 2: ");
        cll.printList();
        cll.deleteByValue(2);
        System.out.print("After delete by value 2: ");
        cll.printList();
    }
}
