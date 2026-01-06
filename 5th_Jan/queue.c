#include <stdio.h>
#define MAX 5

int queue[MAX];
int front = -1;
int rear  = -1;

int isEmpty() {
    return (front == -1);
}

int isFull() {
    return (rear == MAX - 1);
}

void enqueue(int item) {
    if (isFull()) {
        printf("Queue Overflow\n");
        return;
    }
    if (front == -1) {
        front = 0;
    }
    rear++;
    queue[rear] = item;
    printf("Inserted: %d\n", item);
}

int dequeue() {
    int item;
    if (isEmpty()) {
        printf("Queue Underflow\n");
        return -1;
    }
    item = queue[front];
    front++;

    if (front > rear) {
        front = -1;
        rear  = -1;
    }
    return item;
}

int peek() {
    if (isEmpty()) {
        printf("Queue is empty\n");
        return -1;
    }
    return queue[front];
}

void display() {
    int i;
    if (isEmpty()) {
        printf("Queue is empty\n");
        return;
    }
    printf("Queue elements: ");
    for (i = front; i <= rear; i++) {
        printf("%d ", queue[i]);
    }
    printf("\n");
}

int main() {
    enqueue(10);
    enqueue(20);
    enqueue(30);

    display();

    printf("Deleted: %d\n", dequeue());
    printf("Front element: %d\n", peek());

    display();
    return 0;
}
