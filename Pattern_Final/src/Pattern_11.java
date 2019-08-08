  
/*
    A
   ABa
  ABCba
 ABCDcba
ABCDEdcba

 */
import java.util.Scanner;
public class Pattern_11 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number of Lines : ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=n-i;j++)
				System.out.print(" ");
			for (int k=1;k<=i;k++)
				System.out.print((char)(k+64));
			for (int l=i-1;l>=1;l--)
				System.out.print((char)(l+96));
			System.out.println();
		}
	}
}
