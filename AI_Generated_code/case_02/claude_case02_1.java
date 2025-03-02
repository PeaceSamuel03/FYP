import java.util.Scanner;

public class CylinderCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter radius and length
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();

        // Calculate the area and volume
        final double PI = 3.14159;
        double area = radius * radius * PI;
        double volume = area * length;

        // Display results
        System.out.println("The area of the cylinder is " + area);
        System.out.println("The volume of the cylinder is " + volume);

        input.close();
    }
}