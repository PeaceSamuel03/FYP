import java.util.Scanner;

public class MatrixDiagonalSum {
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

        // Call the method to calculate the sum of the leading diagonal
        double diagonalSum = sumMajorDiagonal(matrix);

        // Display the sum
        System.out.println("Sum of the elements on the leading diagonal: " + diagonalSum);

        scanner.close();
    }

    // Method to calculate the sum of the leading diagonal
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) { // Loop through rows
            sum += m[i][i]; // Access diagonal elements (m[0][0], m[1][1], ...)
        }
        return sum;
    }
}
