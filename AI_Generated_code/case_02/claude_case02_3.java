import java.util.Scanner;

public class CylinderCalculator {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Define PI constant
        final double PI = 3.14159;
        
        // Prompt and get radius input
        System.out.println("Enter the radius of the cylinder:");
        double radius = scanner.nextDouble();
        
        // Prompt and get length input
        System.out.println("Enter the length of the cylinder:");
        double length = scanner.nextDouble();
        
        // Calculate the circle area (base of cylinder)
        double area = radius * radius * PI;
        
        // Calculate the volume of the cylinder
        double volume = area * length;
        
        // Output the results
        System.out.println("The area of the cylinder is: " + area);
        System.out.println("The volume of the cylinder is: " + volume);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}