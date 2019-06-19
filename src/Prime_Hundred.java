import java.util.*;
class Prime_Hundred
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit");
		int n= sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			boolean b = prime (i);
			if (b)
				System.out.print (i+",");
					}
		
	}
private static boolean prime(int x)
{
	int f=0;
	for (int j=1;j<=x;j++)
	{
		if (x%j==0)
			f++;
	}
	return f == 2;
	}
}

