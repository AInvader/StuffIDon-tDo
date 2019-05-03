import java.util.Scanner;
class ArrReverse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Length of Array : ");
		int len=sc.nextInt();
		int[] m = new int[len];
		int len2=len;
		for (int i=0;i<len;i++)
		{
			System.out.print ("Enter Element of Array : ");
			m[i]=sc.nextInt();
		}		
		for (int i=0;i<len;i++)
		{
			//swap
			m[i]=m[len2-1];
			len2=len2-1;
		}
		System.out.print("Sorted Array : ");
		for (int i=0;i<len;i++)
		{
			System.out.print(m[i]+" ");

		}	
	}
}