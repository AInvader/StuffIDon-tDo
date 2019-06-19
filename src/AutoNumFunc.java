import java.util.Scanner;
class AutoNumFunc
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter limit : ");
		int lim=sc.nextInt();
		for (int x=0;x<=lim;x++)
		{
			if (AutoCheck(x))
				System.out.println(x);
			else
			    System.out.println("Not");
		}
	}
	private static boolean AutoCheck(int z)
	{
			int c=0;int check=0;		
			int copy=z;
			while (z>0)
			{
				c++;
				z=z/10;
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
		return check == c;
	}
}
