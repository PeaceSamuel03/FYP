import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        // Create a scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Accept radius and length as input from the user
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();

        // Calculate the area of the cylinder
        double area = radius * radius * 3.14159;

        // Calculate the volume of the cylinder
        double volume = area * length;

        // Print the area and volume with appropriate formatting
        System.out.printf("Area of the cylinder: %.2f\n", area);
        System.out.printf("Volume of the cylinder: %.2f\n", volume);

        // Close the scanner
        scanner.close();
    }
}
