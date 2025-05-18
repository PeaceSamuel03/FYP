import java.util.Scanner;

public class MatrixDiagonalSum {

    // Method to calculate the sum of the leading diagonal
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += m[i][i]; // Summing diagonal elements (m[0][0], m[1][1], m[2][2], m[3][3])
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a 4x4 matrix
        double[][] matrix = new double[4][4];

        // Prompt the user to enter a 4x4 matrix
        System.out.println("Enter a 4×4 matrix row by row:");

        // Read the matrix input from the user
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Calculate the sum of the major diagonal
        double diagonalSum = sumMajorDiagonal(matrix);

        // Print the result
        System.out.println("Sum of the elements on the leading diagonal: " + diagonalSum);

        // Close the scanner
        scanner.close();
    }
}
