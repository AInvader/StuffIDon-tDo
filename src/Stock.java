import java.util.Scanner;
class Stock {
	private String name;
	private int quantity;
	private double rate;
	private static Scanner sc=new Scanner(System.in);
	private Stock() {
		name="";
		quantity=0;
		rate=0;
	}
	private void input() {
		System.out.print("Enter Name : ");
		name=sc.nextLine();
		System.out.print("Enter Quantity : ");
		quantity=sc.nextInt();
		System.out.print("Enter Rate : ");
		rate=sc.nextDouble();
	}
	private void sell(int x) {
		if (x>quantity)
			System.out.println("Not enough stock to sell");
		else
			quantity=quantity-x;
	}
	private void buy(int y,double r) {
		quantity=quantity+y;
		if (r>rate)
			rate=r;
	}
	private void display() {
		System.out.println();
		System.out.println("Name : "+name);
		System.out.println("Quantity : "+quantity);
		System.out.println("Valuation : "+(rate*quantity));
	}
	public static void main (String[] args) {
		Stock obj=new Stock();
		obj.input();
		System.out.print("Enter Quantity to Sell : ");
		int x=sc.nextInt();
		obj.sell(x);
		System.out.print("Enter Quantity to Buy : ");
		int y=sc.nextInt();
		System.out.print("Enter Rate : ");
		double r=sc.nextDouble();
		obj.buy(y,r);
		obj.display();
	}
}