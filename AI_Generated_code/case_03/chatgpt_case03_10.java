import java.util.Scanner;

// Class to represent a person and calculate their BMI
class Person {
    private double weight;  // Weight in pounds
    private double feet;    // Height in feet
    private double inches;  // Height in inches
    private double bmi;     // BMI
    private String category; // BMI Category

    // Constructor to initialize weight and height
    public Person(double weight, double feet, double inches) {
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
        calculateBMI();
        categorizeBMI();
    }

    // Method to calculate BMI
    private void calculateBMI() {
        // Convert height to inches
        double heightInInches = feet * 12 + inches;

        // BMI calculation: BMI = weight (kg) / height (m)^2
        // Convert weight from pounds to kilograms (1 lb = 0.45359237 kg)
        // Convert height from inches to meters (1 inch = 0.0254 m)
        this.bmi = weight * 0.45359237 / (heightInInches * 0.0254) / (heightInInches * 0.0254);
    }

    // Method to categorize BMI
    private void categorizeBMI() {
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            category = "Normal weight";
        } else if (bmi >= 25 && bmi < 35) {
            category = "Overweight";
        } else {
            category = "Obese";
        }
    }

    // Method to display the BMI and its category
    public void displayBMIInfo() {
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Category: " + category);
    }
}

public class BMICalculatorApp {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Accept weight in pounds (real number)
        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        // Accept height in feet and inches (real numbers)
        System.out.print("Enter height in feet: ");
        double feet = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches = scanner.nextDouble();

        // Create a Person object and calculate the BMI
        Person person = new Person(weight, feet, inches);

        // Display BMI and category information
        person.displayBMIInfo();

        // Close the scanner
        scanner.close();
    }
}
