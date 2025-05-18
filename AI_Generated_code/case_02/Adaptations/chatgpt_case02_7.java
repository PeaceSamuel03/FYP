import java.util.Scanner;
import java.text.DecimalFormat;

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
        
        // Create a DecimalFormat object for formatting the output
        DecimalFormat df = new DecimalFormat("#.00");

        double radius = 0;
        double length = 0;

        try {
            // Accept radius and length of the cylinder
            System.out.print("Enter the radius of the cylinder: ");
            radius = scanner.nextDouble();

            System.out.print("Enter the length of the cylinder: ");
            length = scanner.nextDouble();

            // Validate the input
            if (radius <= 0 || length <= 0) {
                System.out.println("Radius and length must be positive values.");
                return;
            }

            // Calculate the area using the method
            double area = calculateArea(radius);

            // Calculate the volume using the method
            double volume = calculateVolume(area, length);

            // Print the results with two decimal places
            System.out.println("Area of the cylinder: " + df.format(area));
            System.out.println("Volume of the cylinder: " + df.format(volume));

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter valid numerical values.");
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }
}
