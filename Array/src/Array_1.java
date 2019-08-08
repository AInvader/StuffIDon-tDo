import java.util.Scanner;// importing scanner 
public class Array_1 {// starting class
	private static Scanner ob;private static Scanner sc;// declaring scanner 
		public static void main(String args[]) {// declaring main method
		ob = new Scanner (System.in);
		int n=ob.nextInt();
		int a[]=new int [n];int b[]=new int [n]; int res[]= new int [n];		   
for (int i=0;i<n-1;i++)
{	sc = new Scanner (System.in);
	int n1=sc.nextInt();int n2=sc.nextInt();
			a[i]= n1;b[i]=n2;res [i]=a[i]*b[i];			
		System.out.println(res[i]);}}}

	



