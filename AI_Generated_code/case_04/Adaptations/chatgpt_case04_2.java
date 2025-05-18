public class MilesToKilometersConversion {

    public static void main(String[] args) {
        // Create an array to store the first 10 miles
        int[] miles = new int[10];

        // Fill the array with the first 10 miles (1 to 10)
        for (int i = 0; i < 10; i++) {
            miles[i] = i + 1;
        }

        // Print the header of the conversion table
        System.out.println("Miles\tKilometers");
        System.out.println("--------------------");

        // Loop through the miles array and convert each value to kilometers
        for (int i = 0; i < miles.length; i++) {
            // Convert the mile to kilometers
            double kilometers = convertMilesToKilometers(miles[i]);
            
            // Print the result in a tabular format
            System.out.printf("%d\t%.3f\n", miles[i], kilometers);
        }
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKilometers(int miles) {
        // Conversion factor: 1 mile = 1.609 kilometers
        return miles * 1.609;
    }
}
