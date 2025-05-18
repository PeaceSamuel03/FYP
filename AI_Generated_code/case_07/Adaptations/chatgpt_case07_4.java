import java.util.Scanner;

public class MatrixDiagonalSumDoWhile {

    // Method to calculate the sum of the leading diagonal using a do-while loop
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        int i = 0;
        do {
            sum += m[i][i]; // Add diagonal element
            i++; // Move to the next index
        } while (i < m.length); // Condition to continue looping

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define a 4x4 matrix
        double[][] matrix = new double[4][4];

        // Prompt the user to enter a 4x4 matrix
        System.out.println("Enter a 4×4 matrix row by row:");

        // Read input into the matrix
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Calculate and display the sum of the major diagonal using a do-while loop
        System.out.println("Sum of the elements on the leading diagonal: " + sumMajorDiagonal(matrix));

        scanner.close();
    }
}
