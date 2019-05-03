import java.util.Scanner;
class Caesar_Cipher {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String s=sc.nextLine();
		System.out.print(encrypt(s));
	}
	public static String encrypt(String s) {
		char[] s1=s.toCharArray();
		for (int i=0;i<s1.length;i++) {
			s1[i]=(char)(((int)(s1[i]))+(int)(Math.random()*10));
		}
		String encrypted=new String(s1);
		return encrypted;
	}
}