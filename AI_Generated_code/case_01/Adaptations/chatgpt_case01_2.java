public class Welcome {
    public static void main(String[] args) {
        // Create an array with 5 elements
        String[] welcomeMessages = new String[5];

        // Use a forEach loop to iterate over the array and print "Welcome to Java"
        java.util.Arrays.stream(welcomeMessages)
            .forEach(message -> System.out.println("Welcome to Java"));
    }
}
