import java.util.Scanner;

class PalindromeCont {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n=sc.nextInt();
		int c=0;
		while (c<=10) {
			if (isPalindrome(n)) {
				System.out.print(n);
				break;
			}
			else {
				n=n+reverse(n);
				c++;
			}
		}
	}
	static boolean isPalindrome(int n) {
		return n == reverse(n);
	}
	static int reverse (int n) {
		int rev=0;
		while (n>0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		return rev;
	}
}