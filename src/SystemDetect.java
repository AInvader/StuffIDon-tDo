import java.util.Scanner;
class SystemDetect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		String s = sc.nextLine();
		boolean b= false;
		for (int i=0;i<s.length();i++) {
			if (Character.isLetter(s.charAt(i))) {
				b=true;
				System.out.print("Hexadecimal");
				break;
			}
		}		
		if (!b) {
			int n=Integer.valueOf(s);
			int m=0;
			while (n>0) {
				int d = n%10;
				if (d>m)
					m=d;
				n=n/10;
			}
			if (m<2)
				System.out.println("Binary");
			if (m<8)
				System.out.println("Octal");
			System.out.println("Decimal");
			System.out.print("Hexadecimal");
		}
	}
}