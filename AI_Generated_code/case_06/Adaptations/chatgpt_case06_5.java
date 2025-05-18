import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseOrderUsingQueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();  // Queue to store integers

        // Accept 10 integers from the user and add them to the queue
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            queue.add(number);  // Enqueue the number
        }

        // Display the integers in reverse order by dequeuing them into an ArrayList
        System.out.println("Integers in reverse order:");
        Integer[] reversed = new Integer[10];  // Array to store the numbers in reverse
        for (int i = 9; i >= 0; i--) {
            reversed[i] = queue.poll();  // Dequeue and store in the array
        }

        // Print the reversed integers
        for (int number : reversed) {
            System.out.print(number + " ");
        }
        System.out.println();  // Move to the next line after printing

        scanner.close();
    }
}
