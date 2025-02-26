import java.util.Scanner;

public class CylinderAreaVolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for radius and length of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = scanner.nextDouble();

        // Calculate area and volume
        double area = radius * radius * 3.14159;
        double volume = area * length;

        // Output the results
        System.out.printf("The area of the cylinder is: %.4f\n", area);
        System.out.printf("The volume of the cylinder is: %.4f\n", volume);

        scanner.close();
    }
}
