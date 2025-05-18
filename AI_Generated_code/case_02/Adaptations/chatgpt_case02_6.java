import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

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
        // Create a BufferedReader to take input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Accept radius and length of the cylinder
            System.out.print("Enter the radius of the cylinder: ");
            double radius = Double.parseDouble(reader.readLine());

            System.out.print("Enter the length of the cylinder: ");
            double length = Double.parseDouble(reader.readLine());

            // Validate that the radius and length are positive numbers
            if (radius <= 0 || length <= 0) {
                System.out.println("Radius and length must be positive numbers.");
                return;
            }

            // Calculate the area using the method
            double area = calculateArea(radius);

            // Calculate the volume using the method
            double volume = calculateVolume(area, length);

            // Print the results
            System.out.printf("Area of the cylinder: %.2f\n", area);
            System.out.printf("Volume of the cylinder: %.2f\n", volume);

        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter valid numbers.");
        }
    }
}
