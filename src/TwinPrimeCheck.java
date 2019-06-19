import java.util.*;
class TwinPrimeCheck
{
    public static void main(String[] args)
		{
            Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 Numbers to check for Twin Prime");
			int a = sc.nextInt();
			int b = sc.nextInt();
			{
				if ((Prime(a))&& (Prime(b))&& ((a-b)==2 || (b-a)==2))
					System.out.println("Twin Prime");
				else
					System.out.println("Not Twin Prime");
			}
		}
		private static boolean Prime(int x)
		{
			for ( int j=2;j<=x/2;j++)
			{
				if (x%j==0)
					return false;
			}
			return true ;
		}
}


