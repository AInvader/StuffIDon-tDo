import java.util.Scanner;
class AutobiographicalNum
{
	public static void main(String[] args) 
	{
		int c=0;int check=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n=sc.nextInt();
		int copy=n;
		while (n>0)
		{
			c++;
			n=n/10;
		}
		int[] a = new int[10];
		int[] b = new int[10];
		int len=a.length;
		for (int i=0;i<len;i++)
		{
			b[i]=0;
		}
		for (int i=c-1;i>=0;i--)
		{
			int d=copy%10;
			a[i]=d;
			b[d]++;
			copy=copy/10;
		}
		for (int i=0;i<len;i++)
		{
			if (a[i]==b[i])
			{
				check++;
			}
		}
		if (check==c)
		{
			System.out.println("Autobiographical Number");
		}
		else 
		{
			System.out.println("Not an Autobiographical Number");
		}
	}
}