import java.util.Scanner;
class Disarium {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n=sc.nextInt();
		if (isDisarium(n))
			System.out.println(n+" is a Disarium Number");
		else 
			System.out.println(n+" is not a Disarium Number");
	}
	private static boolean isDisarium(int x) {
		int reverse=0;int digit=0;int c=0;int sum=0;int copy=x;
		while (x>0) {
			int d=x%10;
			reverse=(reverse*10)+d;
			digit++;
			x=x/10;
		}
		for (int i=1;i<=digit;i++){
			int d=reverse%10;
			reverse=reverse/10;
			sum=sum+(int)(Math.pow(d,i));
		}
		return copy == sum;
	}
}