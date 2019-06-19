import java.util.Scanner;
class Security {
	private String n;
	private static int h;
	private double r;
	private double w;
	private void get() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name : ");
		n=sc.nextLine();
		System.out.print("Enter No. of Hours : ");
		h=sc.nextInt();
		System.out.print("Enter Wages Paid per Hour : ");
		r = sc.nextDouble();

	}
	private void calwage() {
		if (h<=40.0)
			w=h*r;
		else if (h <= 60.0)
			w=1.5*h*r;
		else if (h <= 70)
			w=2*h*r;
	}
	private void display() {
		System.out.format("%1s%10s%10s","Name","Hours","Wages");
		System.out.println();
		System.out.format("%1s%6s%15s",n,h,w);
	}
	public static void main(String[] args) {
		Security obj=new Security();
		obj.get();
		if (h<70) {
			obj.calwage();
			obj.display();
		}
		else
			System.out.println("Security Workers are not allowed to work for more than 70 hours a week");
	}
}