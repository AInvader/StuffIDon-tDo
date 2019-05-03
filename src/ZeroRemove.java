import java.util.Scanner;
class ZeroRemove {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n=sc.nextInt();
		String s=Integer.toString(n);
		s=s.replaceAll("0","");
		System.out.print(s);		
	}
}