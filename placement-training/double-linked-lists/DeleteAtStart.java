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

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        current.next = newNode;
        newNode.prev = current;
    }

    void deleteAtStart() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        if (head.next == null) {
            head = null;
            return;
        }
        
        head = head.next;
        head.prev = null;
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
}

public class DeleteAtStart {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        
        System.out.println("Original list:");
        list.display();
        
        System.out.println("\nAfter deleting at start:");
        list.deleteAtStart();
        list.display();
        
        System.out.println("\nAfter deleting at start again:");
        list.deleteAtStart();
        list.display();
    }
}
