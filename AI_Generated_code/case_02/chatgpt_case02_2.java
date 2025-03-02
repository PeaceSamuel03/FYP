import java.util.Scanner;

public class CylinderCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius and length of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();

        // Calculate the area and volume of the cylinder
        double area = radius * radius * 3.14159;
        double volume = area * length;

        // Output the results
        System.out.printf("The area of the cylinder is: %.2f\n", area);
        System.out.printf("The volume of the cylinder is: %.2f\n", volume);

        // Close the scanner
        scanner.close();
    }
}
