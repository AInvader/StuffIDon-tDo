import java.util.Scanner;
class Spy
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);		
		System.out.print("Enter Number : ");
		int n=sc.nextInt();int prod=1;int sum=0;int copy=n;
		while (n>0)
		{
			int d=n%10;
			prod=prod*d;
		}	
		while (copy>0)
		{
			int d=n%10;
			sum=sum+d;
		}
		if (sum==prod)
			System.out.print("Spy Number");
		else 
			System.out.print("Not a Spy Number");
	}
}