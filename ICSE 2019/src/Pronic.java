import java.util.Scanner;
class Pronic
{
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n=sc.nextInt();
		boolean b=false;
		for (int p=0;p<n;p++)
		{
			if (p*(p+1)==n)
			{
				b=true;
				break;
			}
		}
		if (b==true)
		{
			System.out.println("Pronic Number ");
		}
		else 
		{
			System.out.println("Not a Pronic Number");
		}
	}
}