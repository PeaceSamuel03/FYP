import java.util.Scanner;

public class DiagonalSumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a 4x4 matrix
        double[][] matrix = new double[4][4];

        // Prompt user for input
        System.out.println("Enter a 4×4 matrix row by row:");

        // Read matrix elements from user input
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                matrix[row][col] = input.nextDouble();
            }
        }

        // Calculate and display the diagonal sum
        double diagonalSum = sumMajorDiagonal(matrix);
        System.out.printf("Sum of the leading diagonal elements: %.2f\n", diagonalSum);

        // Close the scanner
        input.close();
    }

    // Method to compute sum of the leading diagonal
    public static double sumMajorDiagonal(double[][] matrix) {
        double sum = 0;
        for (int index = 0; index < matrix.length; index++) { // Iterate over diagonal elements
            sum += matrix[index][index];
        }
        return sum;
    }
}
