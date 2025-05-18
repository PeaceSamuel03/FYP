import java.util.Scanner;

public class CylinderCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Constants
        final double PI = 3.14159;
        
        // Get input from user
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        
        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();
        
        // Calculate area and volume
        double area = radius * radius * PI;
        double volume = area * length;
        
        // Display results
        System.out.printf("The area of the cylinder is %.5f\n", area);
        System.out.printf("The volume of the cylinder is %.5f\n", volume);
        
        // Close the scanner
        input.close();
    }
}