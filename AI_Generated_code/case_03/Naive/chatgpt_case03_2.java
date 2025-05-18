import java.util.Scanner;

public class BMI_Calculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Accept the weight in pounds from the user
        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        // Accept the height in feet and inches from the user
        System.out.print("Enter height in feet: ");
        double feet = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches = scanner.nextDouble();

        // Convert height to inches
        double heightInInches = feet * 12 + inches;

        // Calculate BMI using the formula
        double bmi = weight * 0.45359237 / (heightInInches * 0.0254) / (heightInInches * 0.0254);

        // Display the BMI result
        System.out.printf("BMI: %.2f\n", bmi);

        // Categorize BMI and display the result
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category: Normal weight");
        } else if (bmi >= 25 && bmi < 35) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

        // Close the scanner
        scanner.close();
    }
}
