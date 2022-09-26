import java.util.Scanner;

class Queue {

    final int MAX = 5;
    int front = -1;
    int rear = -1;
    int[] myQueue = new int[MAX];

    void enqueue(int x) {
        if (front == -1 && rear == -1) {
            front = rear = 0;
            myQueue[rear] = x;
        } else if (rear == MAX - 1) {
            System.out.println("Queue Overflow");
        } else {
            myQueue[++rear] = x;
        }
    }

    void dequeue() {
        if ((front == -1 && rear == -1) || front > rear)
            System.out.println("Queue Underflow");
        else {
            front++;
            if (front > rear)
                front = rear = -1;
        }
    }

    int peek() {
        if ((front == -1 && rear == -1) || front > rear)
            return -1;
        else
            return myQueue[front];
    }

    void display() {
        if ((front == -1 && rear == -1) || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            for (int i = front; i <= rear; i++)
                System.out.print(myQueue[i] + " ");
            System.out.println();
        }
    }

}

class QueueImp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int option, val;
        do {

            System.out.println("\nMENU\n1. Enqueue\n2. Dequeue\n3. Peek\n4. Display\n5. Quit");
            System.out.print("Enter any one option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    val = q.peek();
                    if (val == -1)
                        System.out.println("Queue Underflow");
                    else
                        System.out.println("Topmost element: " + val);
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    break;
            }
        } while (option != 5);
        sc.close();
    }
}
