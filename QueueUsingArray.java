import java.util.Scanner;
 class Queue {
    public int front, rear;
    public int maxsize;
    public int[] queuearray;
    public Queue(int maxsize) {
        this.maxsize = maxsize;
        front = rear = -1;
        queuearray = new int[this.maxsize];
    }
public boolean isEmpty() {
    return front == -1 && rear == -1;
    }
private boolean isFull() {
    return (front == 0 && rear == (maxsize - 1)) || (front == rear + 1);
    }
public void enqueue(int element) {
    if (isEmpty()) {
        front++;
        rear++;
        queuearray[rear] = element;
    } 
    else if (isFull()) {
        System.out.println("queue is full");
    } 
    else {
        rear = (rear + 1) % maxsize;
        queuearray[rear] = element;
    }
}
public Integer dequeue() {
    if (isEmpty()) {

        return null;
    } 
    else if (front == rear) {
        Integer deleted_no = queuearray[front];
        front = rear = -1;
        return deleted_no;
    } 
    else {
        Integer deleted_no = queuearray[front];
        front = (front + 1) % maxsize;
        return deleted_no;
    }
}
public void printAll() {
    int temp = front;
    if (isEmpty()) {
        System.out.print("queue is empty");
        return;
    }
    System.out.print(queuearray[temp]);
    while (temp != rear) {
    temp = (temp + 1) % maxsize;
    System.out.print(queuearray[temp]);
    }
    }
}
public class QueueUsingArray {
public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of queue");
    int QUEUESIZE=sc.nextInt();
Queue queue = new Queue(QUEUESIZE);
System.out.println("Menu:\n1:enqueue\n2:dequeue\n3:print elements in queue\n4:Exit\n");
while (true) {
   System.out.println("Enter your choice:");
    int choice =sc.nextInt();
    switch (choice) {
    case 1:
    System.out.println("Enter a number to insert into the queue:");
    int number = sc.nextInt();
    queue.enqueue(number);

    break;
    case 2:
    Integer deletednumber=queue.dequeue();

    if (deletednumber == null) {

    System.out.println("Element cannot be deleted from empty queue");
    } 
    else
        System.out.println("Element " + deletednumber + " deleted from the queue");
        break;
    case 3:
    System.out.println("The element in queue are:");
    queue.printAll();
    System.out.println("");

    break;
    case 4:
        return;
    default:
        System.out.println("invalid choice");

        continue;

    }
}
}
}