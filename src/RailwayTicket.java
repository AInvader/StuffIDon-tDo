import java.util.Scanner;
class RailwayTicket {
	String name;
	String coach;
	long mobno;
	int amt;
	int totalamt;
	private void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name : ");
		name=sc.nextLine();
		System.out.print("Enter Coaach : ");
		coach=sc.nextLine();
		System.out.print("Enter Mobile No. : ");
		mobno=sc.nextLong();
		System.out.print("Enter Basic Amount : ");
		amt=sc.nextInt();
	}
	private void update() {
		if (coach.equalsIgnoreCase("First_AC")) 
			totalamt=amt+700;		
		else if (coach.equalsIgnoreCase("Second_AC")) 
			totalamt=amt+500;
		else if (coach.equalsIgnoreCase("Third_AC"))
			totalamt=amt+250;
		else
			totalamt=amt;
	}
	private void display() {
		System.out.println("Name : "+name);
		System.out.println("Coach : "+coach);
		System.out.println("Mobile No. : "+mobno);
		System.out.println("Total Amount : "+totalamt);
	}
	public static void main(String[] args) {
		RailwayTicket obj=new RailwayTicket();
		obj.accept();
		obj.update();
		obj.display();
	}
}