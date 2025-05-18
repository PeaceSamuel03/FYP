import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        double radius = 0;
        double length = 0;

        // Loop until a valid radius is entered (positive real number)
        while (true) {
            System.out.print("Enter the radius of the cylinder: ");
            if (scanner.hasNextDouble()) {
                radius = scanner.nextDouble();
                if (radius > 0) {
                    break; // Exit the loop if a valid positive value is entered
                } else {
                    System.out.println("Please enter a positive number for the radius.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number for the radius.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Loop until a valid length is entered (positive real number)
        while (true) {
            System.out.print("Enter the length of the cylinder: ");
            if (scanner.hasNextDouble()) {
                length = scanner.nextDouble();
                if (length > 0) {
                    break; // Exit the loop if a valid positive value is entered
                } else {
                    System.out.println("Please enter a positive number for the length.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number for the length.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Calculate the area of the cylinder
        double area = radius * radius * 3.14159;

        // Calculate the volume of the cylinder
        double volume = area * length;

        // Print the results
        System.out.printf("Area of the cylinder: %.2f\n", area);
        System.out.printf("Volume of the cylinder: %.2f\n", volume);

        // Close the scanner
        scanner.close();
    }
}
