import java.util.Scanner;

/*
ABCDEedcba
ABCD  dcba
ABC    cba
AB      ba
A        a

 */
public class Pattern_12 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner (System.in);
		System.out.println("Enter Number of Lines");
		int n=sc.nextInt();
		for (int i=n;i>=1;i--)
		{
			for (int j=1;j<=i;j++)
				System.out.print((char)(64+j));
			for (int k=1;k<=n-i;k++)
				System.out.print(" ");
			for (int l=1;l<=n-i;l++)
				System.out.print(" ");
			for (int m=i;m>=1;m--)
				System.out.print((char)(96+m));
			System.out.println();
				
		}

	}

}
