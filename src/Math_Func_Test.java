import java.io.DataInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Math_Func_Test {
	public static void main(String[] args)  {
		try {
			DataInputStream in = new DataInputStream(System.in);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Number : ");
			int n=Integer.parseInt(in.readLine());
		}
		catch (Exception e) {
			System.out.println("Wrong Input");
		}
	}
}