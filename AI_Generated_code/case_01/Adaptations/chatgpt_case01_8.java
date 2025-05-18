import java.util.stream.IntStream;

public class Welcome {
    public static void main(String[] args) {
        // Using IntStream to print the message five times
        IntStream.range(0, 5).forEach(i -> System.out.println("Welcome to Java"));
    }
}
