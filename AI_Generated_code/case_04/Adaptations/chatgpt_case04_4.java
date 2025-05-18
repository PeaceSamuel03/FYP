import java.util.HashMap;
import java.util.Map;

public class MilesToKilometersConversion {

    public static void main(String[] args) {
        // Create a map to store miles and their corresponding kilometers
        Map<Integer, Double> milesToKilometersMap = new HashMap<>();

        // Fill the map with miles and their corresponding kilometers
        for (int miles = 1; miles <= 10; miles++) {
            // Calculate the kilometers and put the value in the map
            milesToKilometersMap.put(miles, convertMilesToKilometers(miles));
        }

        // Print the header of the conversion table
        System.out.println("Miles\tKilometers");
        System.out.println("--------------------");

        // Loop through the map and display miles and their corresponding kilometers
        for (Map.Entry<Integer, Double> entry : milesToKilometersMap.entrySet()) {
            // Print mile and corresponding kilometers
            System.out.printf("%d\t%.3f\n", entry.getKey(), entry.getValue());
        }
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKilometers(int miles) {
        // Conversion factor: 1 
