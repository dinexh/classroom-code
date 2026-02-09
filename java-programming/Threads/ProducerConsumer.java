import java.util.*;
class SharedQueue {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 5;

    synchronized void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            while (list.size() == capacity) wait();
            list.add(value++);
            System.out.println("Produced: " + value);
            notify();
            Thread.sleep(1000);
        }
    }

    synchronized void consume() throws InterruptedException {
        while (true) {
            while (list.isEmpty()) wait();
            int value = list.removeFirst();
            System.out.println("Consumed: " + value);
            notify();
            Thread.sleep(1000);
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        SharedQueue queue = new SharedQueue();

        Thread producer = new Thread(() -> {
            try {
                queue.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                queue.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}