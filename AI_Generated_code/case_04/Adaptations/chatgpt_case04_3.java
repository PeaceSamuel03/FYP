public class MilesToKilometersConversion {

    public static void main(String[] args) {
        // Create an array to store the first 10 miles
        int[] miles = new int[10];
        double[] kilometers = new double[10];

        // Fill the miles array with values from 1 to 10
        for (int i = 0; i < 10; i++) {
            miles[i] = i + 1;
            // Convert miles to kilometers and store in the kilometers array
            kilometers[i] = convertMilesToKilometers(miles[i]);
        }

        // Print the header of the conversion table
        System.out.println("Miles\tKilometers");
        System.out.println("--------------------");

        // Loop through the arrays and display miles and their corresponding kilometers
        for (int i = 0; i < miles.length; i++) {
            System.out.printf("%d\t%.3f\n", miles[i], kilometers[i]);
        }
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKilometers(int miles) {
        // Conversion factor: 1 mile = 1.609 kilometers
        return miles * 1.609;
    }
}
