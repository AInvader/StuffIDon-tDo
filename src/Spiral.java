import java.util.Scanner;
class Spiral {
	static String ReversedNumbers= "";
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a perfect Square : ");
		int n=sc.nextInt();
		int[] numbers=new int[n];
		int printcount=0;int line=0;
		for (int i=1;i<=n;i++) {
			numbers[i-1]=i;
		}
		int Sqrt=(int) Math.sqrt(n);
		for (int j=0;j<Sqrt;j++) {
			if (j%2==0) {
				for (int k=0;k<Sqrt;k++) {
					System.out.print(numbers[k]+" ");
					printcount++;
				}
			}
			else {
				ReversedNumbers=StringTest.StringRev(StringTest.IntegerArraytoString(numbers));
				String PrintString1=StringTest.StringRev(ReversedNumbers).substring((((line+1)*Sqrt)+1)-1,(((line+1)*Sqrt)+1));
				String PrintString2=StringTest.StringRev(PrintString1);
				for (int i=0;i<PrintString2.length();i++) {
					System.out.print(PrintString2.charAt(i)+" ");
					printcount++;
				}
			}
			if (printcount==Sqrt) {
				System.out.println();
				line++;
				printcount=0;
			}
		}
	}
}
