import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a 4x4 matrix
        double[][] matrix = new double[4][4];

        // Prompt user to enter values for the 4x4 matrix
        System.out.println("Enter a 4×4 matrix row by row:");

        // Read user input into the matrix
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Compute the sum of the leading diagonal and display it
        System.out.println("Sum of the elements on the leading diagonal: " + sumMajorDiagonal(matrix));

        // Close scanner
        scanner.close();
    }

    // Method to compute the sum of the leading diagonal elements
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) { // Iterate through rows
            sum += m[i][i]; // Access and sum up diagonal elements
        }
        return sum;
    }
}
