import java.util.Scanner;

public class CylinderComputation {
    
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);
        
        // Variables to hold the radius, length, area, and volume.
        double radius, length, area, volume;
        
        // Constants
        final double PI = 3.14159;
        
        // Prompt the user for the radius of the cylinder.
        System.out.print("Enter the radius of the cylinder: ");
        radius = input.nextDouble();
        
        // Prompt the user for the length of the cylinder.
        System.out.print("Enter the length of the cylinder: ");
        length = input.nextDouble();
        
        // Calculate the area of the cylinder (base area).
        area = radius * radius * PI;
        
        // Calculate the volume of the cylinder.
        volume = area * length;
        
        // Display the calculated area and volume to the user.
        System.out.println("The area of the cylinder is: " + area);
        System.out.println("The volume of the cylinder is: " + volume);
        
        // Close the scanner
        input.close();
    }
}
