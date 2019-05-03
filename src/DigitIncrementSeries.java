import java.util.Scanner; 
class DigitIncrementSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Limit : ");
		int lim=sc.nextInt();
		int num=1;
		for (int i=1;i<=lim;i++) {			
			System.out.print(num+" ");
			num=(num*10)+1;		
		}
	}
}