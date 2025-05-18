import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Accept radius and length of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        
        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();

        // Calculate the surface area and volume
        double area = radius * radius * 3.14159; // Area = radius^2 * π
        double volume = area * length; // Volume = area * length

        // Output the results
        System.out.printf("The surface area of the cylinder is: %.2f\n", area);
        System.out.printf("The volume of the cylinder is: %.2f\n", volume);

        // Close the scanner
        scanner.close();
    }
}
