import java.util.Scanner;
import java.util.LinkedList;

public class ReverseOrderUsingLinkedList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();  // LinkedList to store integers

        // Accept 10 integers from the user and add them to the linked list
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            list.add(number);  // Add number to the list
        }

        // Display the integers in reverse order by iterating the list in reverse
        System.out.println("Integers in reverse order:");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();  // Move to the next line after printing

        scanner.close();
    }
}
