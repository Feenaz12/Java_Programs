package Assignments;
import java.util.Scanner;

public class MatrixWays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int totalPaths = calculateTotalPaths(rows, columns);

        System.out.println("Total number of paths in the matrix: " + totalPaths);

        
    }

    public static int calculateTotalPaths(int rows, int columns) {
        
        int[][] dp = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < columns; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[rows - 1][columns - 1];
    }
}
