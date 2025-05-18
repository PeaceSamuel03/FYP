import java.util.Scanner;

public class Cylinder {

    // Constant for PI
    public static final double PI = 3.14159;

    // Method to calculate the area of the cylinder
    public static double calculateArea(double radius) {
        return radius * radius * PI;
    }

    // Method to calculate the volume of the cylinder
    public static double calculateVolume(double area, double length) {
        return area * length;
    }

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Accept radius and length of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();

        // Calculate the area using the method
        double area = calculateArea(radius);

        // Calculate the volume using the method
        double volume = calculateVolume(area, length);

        // Print the results
        System.out.printf("Area of the cylinder: %.2f\n", area);
        System.out.printf("Volume of the cylinder: %.2f\n", volume);

        // Close the scanner
        scanner.close();
    }
}
