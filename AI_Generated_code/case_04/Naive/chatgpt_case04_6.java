public class MilesToKilometers {
    public static void main(String[] args) {
        final double CONVERSION_FACTOR = 1.609;
        
        System.out.println("Miles   Kilometers");
        System.out.println("------------------");
        
        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * CONVERSION_FACTOR;
            System.out.printf("%-6d  %.3f%n", miles, kilometers);
        }
    }
}