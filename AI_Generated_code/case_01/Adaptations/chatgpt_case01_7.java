public class Welcome {
    public static void main(String[] args) {
        printMessage(5);
    }

    // Recursive method to print the message
    public static void printMessage(int count) {
        if (count > 0) {
            System.out.println("Welcome to Java");
            printMessage(count - 1);  // Recursive call with count reduced by 1
        }
    }
}
