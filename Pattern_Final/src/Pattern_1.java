import java.util.Scanner;
/* 
   ****
   ****
   **** 
   */

public class Pattern_1 
{
		private static Scanner sc;

		public static void main(String[] args) 
	{
			sc = new Scanner (System.in);
			System.out.println("Enter Number of Lines");
			int n=sc.nextInt();
			System.out.println("Enter Line Length");
			int k=sc.nextInt();
	for (int i=1;i<=n;i++)
	{
		for (int j=1;j<=k;j++)
			System.out.print("*");
		System.out.println();
	}
	}
}
