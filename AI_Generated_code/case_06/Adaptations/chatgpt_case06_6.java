import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseOrderUsingDeque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();  // Deque to store integers

        // Accept 10 integers from the user and add them to the Deque
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            deque.addLast(number);  // Add number to the end of the Deque
        }

        // Display the integers in reverse order by removing them from the end
        System.out.println("Integers in reverse order:");
        while (!deque.isEmpty()) {
            System.out.print(deque.removeLast() + " ");  // Remove from the end and print
        }
        System.out.println();  // Move to the next line after printing

        scanner.close();
    }
}
