import java.util.Scanner;

class Stack {

    final static int MAX = 5;
    int top = -1;
    int[] stack = new int[MAX];

    void push(int x) {
        if (top == MAX - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = x;
        }
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else {
            top--;
            System.out.println("Topmost element has been popped");
        }
    }

    int peek() {
        if (top == -1)
            return -1;
        else
            return stack[top];
    }

    void display() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

class StackImp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        int option, val;
        do {

            System.out.println("\nMENU\n1. Push\n2. Pop\n3. Peek\n4. Display\n5. Quit");
            System.out.print("Enter any one option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter value to push: ");
                    val = sc.nextInt();
                    s.push(val);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    val = s.peek();
                    if (val == -1)
                        System.out.println("Stack Underflow");
                    else
                        System.out.println("Topmost element: " + val);
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    break;
            }
        } while (option != 5);
        sc.close();
    }
}
