import java.util.Scanner;
import java.util.Arrays;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of Rows and Columns of 1st Matrix : ");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
		System.out.println("Enter the Elements of 1st Matrix : ");
        int[][] matrix1 = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the number of Rows and Columns of 2nd Matrix : ");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
		System.out.println("Enter the Elements of 1st Matrix : ");
        int[][] matrix2 = new int[rows2][cols2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
		// TEMPLATE BLOCK (Students should complete the code here)
        
        // Step 1: Check if matrix multiplication is possible
        // Hint: Matrix multiplication is only possible if cols1 == rows2
        // Fill in the condition below:
        if (cols1!=rows2) {
            System.out.println("Multiplication Not Possible");
            return;
        }
        
        // Step 2: Initialize the result matrix with dimensions [rows1][cols2]
        int[][] result = new int[rows1 ][ cols2];
        
        // Step 3: Perform matrix multiplication using three nested loops
        // Hint:
        // - Outer loop iterates over rows of matrix1
        // - Middle loop iterates over columns of matrix2
        // - Inner loop performs the sum of product calculations
        
        for (int i = 0; i < rows1 ; i++) {
            for (int j = 0; j <  cols2 ; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        // Step 4: Print the resultant matrix
        // Hint: Use nested loops to print elements row-wise
		System.out.println("The Matrix Multiplication result is : "+Arrays.deepToString(result));
        for (int i = 0; i <  rows1 ; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print( result[i][j] );
                if (j < cols2 - 1) {
                    System.out.print(" "); // Ensure no trailing space at end of row
                }
            }
            System.out.println(); // Move to next row
        }
        
       

/* Hints Section (Check only if you are stuck!)
 * ------------------------------------------------
 * - Matrix multiplication is only possible if cols1 == rows2
 * - Resultant matrix will have dimensions [rows1][cols2]
 * - Use three nested loops:
 *   1. Outer loop for row iteration of matrix1
 *   2. Middle loop for column iteration of matrix2
 *   3. Inner loop for multiplying corresponding elements
 */
 scanner.close();
    }
}