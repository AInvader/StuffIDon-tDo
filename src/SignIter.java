import java.util.Scanner;

class SignIter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Limit : ");
		int limit=sc.nextInt();
		int sign=1;
		int c=1;
		for (int i=1;i<=limit;i++) {
			System.out.print((c+2)*sign+"  ");
			sign=sign*-1;
			c+=2;
		}
	}
}