import java.util.*;
class Twin_Prime2
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter Limit");
	int l= sc.nextInt();
	for (int i=2;i<=l;i++)
	{
		if ((Prime (i))&&(Prime (i+2)))
				System.out.println(i+" "+ "and"+ " "+(i+2)+ " ");
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
