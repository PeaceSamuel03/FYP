import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Accept weight in pounds
        System.out.print("Enter your weight in pounds: ");
        double weight = scanner.nextDouble();

        // Accept height in feet and inches
        System.out.print("Enter your height in feet: ");
        double feet = scanner.nextDouble();

        System.out.print("Enter your height in inches: ");
        double inches = scanner.nextDouble();

        // Convert height to inches (1 foot = 12 inches)
        double totalInches = feet * 12 + inches;

        // Calculate BMI using the formula: 
        // BMI = (weight in kg) / (height in meters)^2
        // Weight conversion: weight in pounds to kilograms = weight * 0.45359237
        // Height conversion: height in inches to meters = height in inches * 0.0254
        double heightInMeters = totalInches * 0.0254;
        double bmi = (weight * 0.45359237) / (heightInMeters * heightInMeters);

        // Display the BMI value
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Categorize BMI
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You are normal weight.");
        } else if (bmi >= 25 && bmi < 35) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

        // Close the scanner
        scanner.close();
    }
}
