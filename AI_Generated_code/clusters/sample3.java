import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Matrix size constant
        final int MATRIX_SIZE = 4;
        double[][] matrix = new double[MATRIX_SIZE][MATRIX_SIZE];

        // Prompt user for input
        System.out.println("Enter the elements of a 4×4 matrix (row by row):");

        for (int i = 0; i < MATRIX_SIZE; i++) {
            for (int j = 0; j < MATRIX_SIZE; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        // Compute diagonal sum and display result
        double diagonalSum = sumMajorDiagonal(matrix);
        System.out.printf("The sum of the leading diagonal is: %.2f%n", diagonalSum);

        input.close();
    }

    // Method to calculate sum of leading diagonal elements
    public static double sumMajorDiagonal(double[][] mat) {
        double sum = 0.0;
        for (int index = 0; index < mat.length; index++) {
            sum += mat[index][index];
        }
        return sum;
    }
}
