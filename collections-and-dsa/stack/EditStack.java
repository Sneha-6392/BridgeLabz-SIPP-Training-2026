package stack;

import java.util.Scanner;

public class EditStack {

    private String[] stack;
    private int top;

    EditStack(int capacity) {
        stack = new String[capacity];
        top = -1;
    }

    boolean push(String edit) {

        if (top == stack.length - 1) {
            System.out.println("Stack Overflow! Cannot record more edits.");
            return false;
        }

        stack[++top] = edit;
        return true;
    }

    String pop() {

        if (top == -1) {
            return "Stack Underflow! No edits to undo.";
        }

        return stack[top--];
    }

    String peek() {

        if (top == -1) {
            return "Stack is Empty";
        }

        return stack[top];
    }

    void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Edit History:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack capacity: ");
        int capacity = sc.nextInt();
        sc.nextLine();

        EditStack editor = new EditStack(capacity);

        while (true) {

            System.out.println("\n1. Push Edit");
            System.out.println("2. Undo Edit");
            System.out.println("3. Peek Latest Edit");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter edit: ");
                    String edit = sc.nextLine();
                    editor.push(edit);
                    break;

                case 2:
                    System.out.println("Undo: " + editor.pop());
                    break;

                case 3:
                    System.out.println("Latest Edit: " + editor.peek());
                    break;

                case 4:
                    editor.display();
                    break;

                case 5:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
