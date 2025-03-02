public class Welcome {
    public static void main(String[] args) {
        // Start the recursive function with count 1
        printWelcome(1);
    }

    // Recursive method to print "Welcome to Java"
    public static void printWelcome(int count) {
        if (count <= 5) {
            System.out.println("Welcome to Java");
            printWelcome(count + 1); // Recursive call with the next count
        }
    }
}
