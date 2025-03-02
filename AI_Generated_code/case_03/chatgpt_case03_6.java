import java.util.Scanner;

public class BMICalculatorApp {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Accept weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        // Accept height in feet and inches
        System.out.print("Enter height in feet: ");
        double feet = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches = scanner.nextDouble();

        // Convert height to inches
        double heightInInches = feet * 12 + inches;

        // Calculate BMI
        double bmi = weight * 0.45359237 / (heightInInches * 0.0254) / (heightInInches * 0.0254);

        // Categorize BMI
        String category = (bmi < 18.5) ? "Underweight" :
                          (bmi >= 18.5 && bmi < 25) ? "Normal weight" :
                          (bmi >= 25 && bmi < 35) ? "Overweight" : "Obese";

        // Display the BMI and category
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Category: " + category);

        // Close the scanner
        scanner.close();
    }
}
