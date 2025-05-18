import java.util.stream.IntStream;

public class MilesToKilometers {
    public static void main(String[] args) {
        final double CONVERSION_FACTOR = 1.609;
        
        System.out.println("Miles   Kilometers");
        System.out.println("------------------");
        
        IntStream.rangeClosed(1, 10).forEach(miles -> {
            double kilometers = miles * CONVERSION_FACTOR;
            System.out.printf("%-6d  %.3f%n", miles, kilometers);
        });
    }
}