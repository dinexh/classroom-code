public class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    public CircularQueue(int cap) {
        capacity = cap;
        queue = new int[capacity];
        front = 0; rear = -1; size = 0;
    }

    public boolean isEmpty() { return size == 0; }
    public boolean isFull() { return size == capacity; }

    public void enqueue(int item) {
        if (isFull()) { System.out.println("Queue is full"); return; }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        System.out.println("Inserted: " + item);
    }

    public int dequeue() {
        if (isEmpty()) { System.out.println("Queue is empty"); return -1; }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public void display() {
        if (isEmpty()) { System.out.println("Queue is empty"); return; }
        System.out.print("Circular Queue: ");
        for (int i = 0; i < size; i++)
            System.out.print(queue[(front + i) % capacity] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.display();
        System.out.println("Deleted: " + cq.dequeue());
        cq.enqueue(40);
        cq.enqueue(50);
        cq.enqueue(60);
        cq.display();
    }
}
