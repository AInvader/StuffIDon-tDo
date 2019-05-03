import java.util.Scanner;

class Pattern_20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of Lines  : ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n-i;j++)
				System.out.print(" ");
			for (int k=1;k<=(1+(i-1)*2);k++)
				System.out.print(k%10);
			System.out.println();
		}
	}
}