import java.util.Scanner;
class Unique_Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Limits : ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		for (int i=m;i<=n;i++) {
			if (isUnique(i))
				System.out.print(i+" ");
		}
	}
	private static boolean isUnique(int n) {
		int a[]=new int[digcount(n)];
		int c=0;
		while (n>0) {
			int d=n%10;
			a[c]=d;
			n=n/10;
			c++;
		}
		for (int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if (a[i]==a[j])
					return false;
			}
		}
		return true;
	}
	private static int digcount(int n) {
		int c=0;
		while (n>0) {
			c++;
			n=n/10;
		}
		return c;
	}
}