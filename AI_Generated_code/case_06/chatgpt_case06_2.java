import java.util.Scanner;
import java.util.Stack;

public class ReverseOrderUsingStack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();  // Stack to hold the integers

        // Accept 10 integers from the user and push them onto the stack
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            stack.push(number);
        }

        // Display the integers in reverse order by popping them from the stack
        System.out.println("Integers in reverse order:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();  // Move to the next line after printing

        scanner.close();
    }
}
