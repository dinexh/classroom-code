import java.util.Scanner;

public class InteractiveCircularLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    private Node tail;
    private final Scanner sc = new Scanner(System.in);

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
        if (tail == null) { System.out.println("List is empty."); return; }
        Node head = tail.next;
        if (pos <= 0) {
            if (head == tail) { tail = null; return; }
            tail.next = head.next;
            return;
        }
        Node cur = head;
        int idx = 0;
        while (idx < pos - 1 && cur.next != head) { cur = cur.next; idx++; }
        if (cur.next == head) { System.out.println("Position out of range."); return; }
        if (cur.next == tail) { cur.next = cur.next.next; tail = cur; }
        else cur.next = cur.next.next;
    }

    public void deleteFirstOccurrence(int val) {
        if (tail == null) { System.out.println("List is empty."); return; }
        Node head = tail.next;
        if (head.data == val) {
            if (head == tail) { tail = null; return; }
            tail.next = head.next; return;
        }
        Node cur = head;
        while (cur.next != head) {
            if (cur.next.data == val) {
                if (cur.next == tail) { cur.next = cur.next.next; tail = cur; }
                else cur.next = cur.next.next;
                return;
            }
            cur = cur.next;
        }
        System.out.println("Value not found.");
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
        if (tail == null) { System.out.println("List is empty."); return; }
        Node start = tail.next;
        Node cur = start;
        StringBuilder sb = new StringBuilder();
        do {
            sb.append(cur.data);
            cur = cur.next;
            if (cur != start) sb.append(" -> ");
        } while (cur != start);
        System.out.println(sb.toString());
    }

    private void menu() {
        while (true) {
            System.out.println();
            System.out.println("--- Circular Linked List Menu ---");
            System.out.println("1. Add first");
            System.out.println("2. Add last");
            System.out.println("3. Add at position");
            System.out.println("4. Delete at position");
            System.out.println("5. Delete first occurrence by value");
            System.out.println("6. Search");
            System.out.println("7. Print list");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int choice;
            try { choice = Integer.parseInt(sc.nextLine().trim()); }
            catch (Exception e) { System.out.println("Invalid input."); continue; }

            switch (choice) {
                case 1:
                    System.out.print("Value: ");
                    addFirst(readInt());
                    break;
                case 2:
                    System.out.print("Value: ");
                    addLast(readInt());
                    break;
                case 3:
                    System.out.print("Position (0-based): ");
                    int p = readInt();
                    System.out.print("Value: ");
                    addAtPosition(p, readInt());
                    break;
                case 4:
                    System.out.print("Position (0-based): ");
                    deleteAtPosition(readInt());
                    break;
                case 5:
                    System.out.print("Value: ");
                    deleteFirstOccurrence(readInt());
                    break;
                case 6:
                    System.out.print("Value: ");
                    System.out.println(search(readInt()) ? "Found" : "Not found");
                    break;
                case 7:
                    printList();
                    break;
                case 0:
                    System.out.println("Exiting.");
                    return;
                default:
                    System.out.println("Unknown option.");
            }
        }
    }

    private int readInt() {
        try { return Integer.parseInt(sc.nextLine().trim()); }
        catch (Exception e) { System.out.println("Invalid number, using 0."); return 0; }
    }

    public static void main(String[] args) {
        InteractiveCircularLinkedList app = new InteractiveCircularLinkedList();
        app.menu();
    }
}
