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

public class InsertAtEnd {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        
        list.insertAtEnd(10);
        list.display();
        
        list.insertAtEnd(20);
        list.display();
        
        list.insertAtEnd(30);
        list.display();
        
        list.insertAtEnd(40);
        list.display();
    }
}
