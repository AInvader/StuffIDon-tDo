import java.util.Scanner;
class Arr3
{
	void main()
	{
		int a[]=new int[3];
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for (int i=0;i<3;i++)
		{
			System.out.println("Enter Marks of Student "+(i+1));
			for (int k=0;k<3;k++)
			{
				System.out.print("Enter Marks of Subject "+(k+1)+" : ");
				int marks =sc.nextInt();
				sum=sum+marks;
			}
			System.out.println("Sum = "+sum);
			System.out.println("Average = "+(sum/3));
			sum=0;
		}
	}
}