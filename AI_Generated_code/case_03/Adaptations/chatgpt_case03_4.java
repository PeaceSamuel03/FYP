import java.util.Scanner;

class Person {
    private double weight;  // Weight in pounds
    private double feet;    // Height in feet
    private double inches;  // Height in inches

    // Constructor to initialize the weight and height
    public Person(double weight, double feet, double inches) {
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    // Method to calculate BMI
    public double calculateBMI() {
        // Convert height to inches (1 foot = 12 inches)
        double totalInches = feet * 12 + inches;

        // Convert weight from pounds to kilograms (1 pound = 0.45359237 kg)
        double weightInKg = weight * 0.45359237;

        // Convert height from inches to meters (1 inch = 0.0254 meters)
        double heightInMeters = totalInches * 0.0254;

        // Calculate BMI
        return weightInKg / (heightInMeters * heightInMeters);
    }

    // Method to categorize BMI
    public void categorizeBMI(double bmi) {
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You are normal weight.");
        } else if (bmi >= 25 && bmi < 35) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }

    // Getter methods (optional)
    public double getWeight() {
        return weight;
    }

    public double getHeightInFeet() {
        return feet;
    }

    public double getHeightInInches() {
        return inches;
    }
}

public class BMICalculator {

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Accept weight in pounds (real number)
        System.out.print("Enter your weight in pounds: ");
        double weight = scanner.nextDouble();

        // Accept height in feet and inches (real numbers)
        System.out.print("Enter your height in feet: ");
        double feet = scanner.nextDouble();

        System.out.print("Enter your height in inches: ");
        double inches = scanner.nextDouble();

        // Create a Person object with the input weight and height
        Person person = new Person(weight, feet, inches);

        // Calculate BMI
        double bmi = person.calculateBMI();

        // Display the BMI value with 2 decimal places
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Categorize the BMI
        person.categorizeBMI(bmi);

        // Close the scanner object
        scanner.close();
    }
}
