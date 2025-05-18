import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Accept weight in pounds
        System.out.print("Enter your weight in pounds: ");
        double weight = scanner.nextDouble();

        // Accept height in feet and inches
        System.out.print("Enter your height (feet): ");
        int feet = scanner.nextInt();

        System.out.print("Enter your height (inches): ");
        int inches = scanner.nextInt();

        // Convert height to inches
        int totalInches = feet * 12 + inches;

        // Calculate BMI using the given formula
        double heightInMeters = totalInches * 0.0254;
        double bmi = (weight * 0.45359237) / (heightInMeters * heightInMeters);

        // Display BMI
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
