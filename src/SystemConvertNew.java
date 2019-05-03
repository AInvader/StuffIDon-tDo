import java.util.Scanner;
class SystemConvertNew {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.print("Conversion From : ");
		String convertFrom=sc.nextLine();
		System.out.print("Conversion To : ");
		String convertTo=sc.nextLine();
		System.out.print(convertFrom +"\n"+convertTo+"\n"+n);
	}
}