public class PriorityQueue {
    private int[] heap;
    private int size, capacity;

    public PriorityQueue(int cap) {
        capacity = cap;
        heap = new int[capacity];
        size = 0;
    }

    private void swap(int i, int j) {
        int t = heap[i]; heap[i] = heap[j]; heap[j] = t;
    }

    public void insert(int val) {
        if (size == capacity) { System.out.println("Heap full"); return; }
        heap[size] = val;
        int i = size++;
        while (i > 0 && heap[(i - 1) / 2] > heap[i]) {
            swap(i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    public int extractMin() {
        if (size == 0) { System.out.println("Heap empty"); return -1; }
        int min = heap[0];
        heap[0] = heap[--size];
        heapify(0);
        return min;
    }

    private void heapify(int i) {
        int smallest = i, left = 2 * i + 1, right = 2 * i + 2;
        if (left < size && heap[left] < heap[smallest]) smallest = left;
        if (right < size && heap[right] < heap[smallest]) smallest = right;
        if (smallest != i) { swap(i, smallest); heapify(smallest); }
    }

    public void display() {
        System.out.print("Priority Queue (min-heap): ");
        for (int i = 0; i < size; i++) System.out.print(heap[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(10);
        pq.insert(30);
        pq.insert(10);
        pq.insert(20);
        pq.insert(5);
        pq.display();
        System.out.println("Extracted min: " + pq.extractMin());
        pq.display();
    }
}
