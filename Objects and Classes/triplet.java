import java.util.Scanner;
class triplet
{
	int a,b,c,x,y,maxnum;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	}
	void findprint()
	{
		if (a>b && a>c)
		{
			maxnum=a;
			x=b;y=c;
		}
		else if (b>a && b>c)
		{
			maxnum=b;
			x=a;y=c;
		}
		else if(c>a && c>b)
		{
			maxnum=c;
			x=a;y=b;
		}
		int maxsquare=(int)(Math.pow(maxnum,2));
		int xsquare=(int)(Math.pow(x,2));
		int ysquare=(int)(Math.pow(y,2));
		if (maxsquare==xsquare+ysquare)
			System.out.print("Pythagorean Triplet");
		else 
			System.out.print("Not Pythagorean Triplet");
	}
	void main()
	{
		triplet ob = new triplet();
		ob.getdata();
		ob.findprint();
	}
}