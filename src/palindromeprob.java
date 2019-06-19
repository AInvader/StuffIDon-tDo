import java.util.Scanner;
class Palindromeprob
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Number of Digits : ");
		int dg = sc.nextInt(); long c=0;
		long maxnum=(long)(Math.pow(10,dg+1))-1;
		for (long i=1;i<=maxnum;i++)
		{
			if (palindromecheck(i))
				c++;
		}
		double prob=((double)c/(double)maxnum);
		System.out.println("Probability is "+prob);
		double probperc = prob*100;
		System.out.print("Percentage is "+(probperc*100)+"%");
	}
	private static boolean palindromecheck(long x)
	{
		long reverse=0;long copy=x;
		while (x>0)
		{
			long d=x%10;
			reverse=reverse*10+d;
			x=x/10;
		}
		return reverse == copy;
	}
}