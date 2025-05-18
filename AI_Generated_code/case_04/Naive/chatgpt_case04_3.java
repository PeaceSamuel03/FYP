public class MilesToKilometers {
    public static void main(String[] args) {
        final double CONVERSION_FACTOR = 1.609;
        int miles = 1;
        
        System.out.println("Miles   Kilometers");
        System.out.println("------------------");
        
        do {
            double kilometers = miles * CONVERSION_FACTOR;
            System.out.printf("%-6d  %.3f%n", miles, kilometers);
            miles++;
        } while (miles <= 10);
    }
}
