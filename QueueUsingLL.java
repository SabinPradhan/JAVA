import java.util.LinkedList;
import java.util.Scanner;

class QueueList {

    LinkedList list = new LinkedList();

    public QueueList() {
    }

    public void clear() {
        list.clear();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public Object firstEl() {
        return list.getFirst();
    }

    public Object dequeue() {
        return list.removeFirst();
    }

    public void enqueue(Object el) {
        list.addLast(el);
    }

    public String toString() {
        return list.toString();
    }
}

class QueueUsingLL {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        QueueList queue = new QueueList();
        System.out.println("Menu:\n1:clear\n2:check empty or not\n3:enqueue\n4:top element\n5:dequeue\n6:Exit\n");
        while (true) {
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    queue.clear();
                    System.out.println("queue is cleared");
                    break;
                case 2:
                    System.out.println("the queue is empty: "+queue.isEmpty());
                    break;
                    
                case 3:
                    System.out.println("Enter a number to insert into the queue:");
                    int number =sc. nextInt();
                    queue.enqueue(number);
                    break;
                case 4:
                    System.out.println("the top element is "+queue.firstEl());
                    break;
                    
                case 5:
                     queue.dequeue();
                    break;
               
                case 6:
                    return;
                default:
                    System.out.println("invalid choice");

                    continue;

            }
        }
    }
}
