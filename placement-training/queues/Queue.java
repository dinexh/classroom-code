public class Queue {
    private int[] queue;
    private int front, rear, capacity;

    public Queue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() { return front == -1; }
    public boolean isFull() { return rear == capacity - 1; }

    public void enqueue(int item) {
        if (isFull()) { System.out.println("Queue Overflow"); return; }
        if (front == -1) front = 0;
        queue[++rear] = item;
        System.out.println("Inserted: " + item);
    }

    public int dequeue() {
        if (isEmpty()) { System.out.println("Queue Underflow"); return -1; }
        int item = queue[front++];
        if (front > rear) { front = -1; rear = -1; }
        return item;
    }

    public int peek() {
        if (isEmpty()) { System.out.println("Queue is empty"); return -1; }
        return queue[front];
    }

    public void display() {
        if (isEmpty()) { System.out.println("Queue is empty"); return; }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) System.out.print(queue[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        System.out.println("Deleted: " + q.dequeue());
        System.out.println("Front: " + q.peek());
        q.display();
    }
}
