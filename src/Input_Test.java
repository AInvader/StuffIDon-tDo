import java.util.Scanner;

class Input_Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		if (sc.hasNextInt()) {
			System.out.print(sc.nextInt()+" is an Integer");
		}
		else if (sc.hasNextDouble())
			System.out.println(sc.nextDouble() +" is a Floating Point Number");
	}
}
