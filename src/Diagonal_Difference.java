import java.util.Scanner;

public class Diagonal_Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Matrix : ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Row " + i + " : ");
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        displayMatrix(a);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 = sum1 + a[i][i];
        }
        for (int row = 0, column = n - 1; row < n && column >= 0; row++, column--) {
            sum2 = sum2 + a[row][column];
        }
        int diff = Math.abs(sum1 - sum2);
        System.out.print("Difference = " + diff);
    }

    public static void displayMatrix(int[][] x) {
        int rows = x.length;
        int col = x[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
