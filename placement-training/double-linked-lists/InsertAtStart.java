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

    void insertAtStart(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
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

public class InsertAtStart {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        
        list.insertAtStart(30);
        list.display();
        
        list.insertAtStart(20);
        list.display();
        
        list.insertAtStart(10);
        list.display();
        
        list.insertAtStart(5);
        list.display();
    }
}
