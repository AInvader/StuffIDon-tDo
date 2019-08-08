import java.util.*;
class Calculate
{
	int a,b,sum,diff;
	void inputdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number : ");
		a=sc.nextInt();
		System.out.print("Enter Seconnd Number : ");
		b=sc.nextInt();
	}
	void calculate()
	{
		sum=a+b;
		if (a>b)
			diff=a-b;
		else if (a==b)
			diff=0;
		else 
			diff=b-a;
	}
	void outputdata()
	{
		System.out.print("Sum = "+sum);
		System.out.print("Difference = "+diff);
	}
	void main()
	{
		Calculate ob=new Calculate();
		ob.inputdata();
		ob.calculate();
		ob.outputdata();
	}
}