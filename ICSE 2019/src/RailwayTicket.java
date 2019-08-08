import java.util.*;
class RailwayTicket 
{	
	String name,coach; long mobno; int amt,totalamt;
	RailwayTicket()
	{
		name="";coach="";
		mobno=0;
		amt=0;totalamt=0;
	}
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name: ");
		name=sc.nextLine();
		System.out.print("Enter Coach : ");
		coach=sc.nextLine();
		System.out.print("Enter Mobile Number : ");
		mobno=sc.nextLong();
		System.out.print("Enter Original Amount : ");
		amt=sc.nextInt();
	}
	void update()
	{
		if (coach.equalsIgnoreCase("First_AC"))
		{	
			totalamt=amt+700;
		}
		else if (coach.equalsIgnoreCase("Second_AC"))
		{
			totalamt=amt+500;
		}
		else if (coach.equalsIgnoreCase("Third_AC"))
		{
			totalamt=amt+250;
		}		
	}
	void display()
	{
		System.out.print("Name : "+name+"\n"+"Coach : "+coach+"\n"+"Total Amount : "+totalamt+"\n"+"Mobile Number : "+mobno);
	}		
	public static void main(String args[])
	{
		RailwayTicket obj=new RailwayTicket();
		obj.accept();
		obj.update();
		obj.display();
	}
}
