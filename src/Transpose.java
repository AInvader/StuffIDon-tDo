import java.util.Scanner;
class Transpose {
	private static final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter Number of Rows and Columns : ");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int[][] matrix = new int[rows][cols];
        acceptMatrix(matrix, rows, cols);
        int[][] transpose = new int[cols][rows];
		for (int i=0;i<cols;i++) {
			for (int j=0;j<rows;j++) {
				transpose[i][j] = matrix[j][i];
			}
		}
		printMatrix(transpose);
	}

	private static void acceptMatrix(int[][] matrix, int rows, int cols) {
		for (int i=0;i<rows;i++) {
			System.out.print("Enter Row "+i+" : ");
			for (int j = 0; j < cols; j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
	}

	private static void printMatrix(int[][] x) {
		int rows=x.length;
		int cols=x[0].length;
		for (int[] ints : x) {
			for (int j = 0; j < cols; j++) {
				System.out.print(ints[j]);
			}
			System.out.println();
		}
	}
}
