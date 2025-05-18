import java.util.Scanner;

public class MatrixDiagonalSumRecursive {

    // Recursive method to calculate the sum of the leading diagonal
    public static double sumMajorDiagonal(double[][] m, int index) {
        if (index == m.length) {
            return 0; // Base case: if index reaches matrix size, return 0
        }
        return m[index][index] + sumMajorDiagonal(m, index + 1); // Recursive step
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

        // Calculate and display the sum of the major diagonal using recursion
        System.out.println("Sum of the elements on the leading diagonal: " + sumMajorDiagonal(matrix, 0));

        scanner.close();
    }
}
