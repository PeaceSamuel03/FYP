import java.util.Scanner;

public class DiagonalSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the size of the matrix
        final int SIZE = 4;
        double[][] matrix = new double[SIZE][SIZE];

        // Get matrix input from the user
        System.out.println("Please enter the values for a 4x4 matrix:");

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print("Enter value for element [" + (row + 1) + "][" + (col + 1) + "]: ");
                matrix[row][col] = scanner.nextDouble();
            }
        }

        // Calculate and display the sum of the leading diagonal
        double diagonalSum = calculateDiagonalSum(matrix);
        System.out.printf("The sum of the leading diagonal elements is: %.2f%n", diagonalSum);

        scanner.close();
    }

    // Method to calculate the sum of the leading diagonal
    public static double calculateDiagonalSum(double[][] mat) {
        double total = 0;
        for (int i = 0; i < mat.length; i++) {
            total += mat[i][i];  // Access diagonal elements
        }
        return total;
    }
}
