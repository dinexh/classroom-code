class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    DoublyLinkedList() {
        this.head = null;
    }

    void create(int[] arr) {
        if (arr.length == 0) return;
        
        head = new Node(arr[0]);
        Node current = head;
        
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }
    }

    void display() {
        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    void displayReverse() {
        if (head == null) return;
        
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        System.out.print("Reverse: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}

public class DoublyLinkedListCreation {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        int[] arr = {10, 20, 30, 40, 50};
        
        list.create(arr);
        list.display();
        list.displayReverse();
    }
}
