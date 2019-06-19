import java.util.Scanner;
class Reverse {
    public static void main (String[] args)
{
    Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
	while (n>0)
	{
		int d =n%10;
		System.out.print(d);
		n=n/10;
	}
}
}
