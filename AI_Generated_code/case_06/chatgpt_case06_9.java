import java.util.Scanner;
import java.util.LinkedList;

public class ReverseOrderLinkedList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> numbersList = new LinkedList<>();  // LinkedList to store integers

        // Accept 10 integers from the user and add them to the LinkedList
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            numbersList.add(number);  // Add the number to the LinkedList
        }

        // Display the integers in reverse order by iterating from the last to the first element
        System.out.println("Integers in reverse order:");
        for (int i = numbersList.size() - 1; i >= 0; i--) {
            System.out.print(numbersList.get(i) + " ");  // Access and print each element in reverse order
        }
        System.out.println();  // Move to the next line after printing

        scanner.close();  // Close the scanner object
    }
}
