import java.util.Scanner;
public class QuadSolve 
{
	public static void main(String[] args) 
	{			
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Equation : ");
		String eq=sc.nextLine();
		eq=eq.trim();
		
		int firstxpos=eq.indexOf('x');
		int lastxpos=eq.lastIndexOf('x');
		
		String x2coeff=eq.substring(0,firstxpos);
		int x2coeff1=Integer.valueOf(x2coeff);	
		System.out.println(x2coeff1);
		
		String xcoeff=eq.substring(firstxpos+2,lastxpos);
		int xcoeff1=Integer.valueOf(xcoeff);
		System.out.println(xcoeff1);
		
		String c=eq.substring(lastxpos+1);
		int c1=Integer.valueOf(c);
		System.out.println(c1);

		double[] ans = Solver(x2coeff1, xcoeff1, c1);
		System.out.println("Either : "+ans[0]);
		System.out.println("Or : "+ans[1]);
        System.out.println("Discriminant = "+ans[2]);
	}
//-----------------------------------------------------------------
	public static double[] Solver(int a,int b,int c)
	{
		double a1=(double)a;
		double b1=(double)b;
		double c1=(double)c;
		
		System.out.println(a1+" "+b1+" "+c1);

		double[] ans = new double[3];

		double discrim=((b1 * b1) - 4 * a1 * c1);

		ans[0] = (((-1.0 * b1) + Math.sqrt(discrim))/(2 * a1));
		ans[1] = (((-1.0 * b1) - Math.sqrt(discrim))/(2 * a1));
		ans[2] = discrim;
		
		return ans;
	}
}
