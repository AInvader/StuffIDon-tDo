import java.util.Scanner;

/*
a
ab
abc
abcd
abcde

 */
public class Pattern_10 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner (System.in);
		System.out.println("Enter Number of Lines");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
				System.out.print((char)(96+j));
			System.out.println();
		}

	}

}
