import java.util.Scanner;
@SuppressWarnings("UnusedAssignment")
class System_Convert
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		String n=sc.nextLine();		
		System.out.print("Conversion from : ");
		String convertFrom=sc.nextLine();
		System.out.print("Convesion to : ");
		String convertTo=sc.nextLine();
		if (convertTo.equalsIgnoreCase(convertFrom))
		{
			System.out.print("Error");
		}
		if (convertFrom.equalsIgnoreCase("Decimal"))
			{
				int base=0;
				if (convertTo.equalsIgnoreCase("Binary"))
				{
					base =2;				
				}
				else if (convertTo.equalsIgnoreCase("Octal"))
				{
					base=8;						
				}
				else if (convertTo.equalsIgnoreCase("Hexadecimal"))
				{
					base =16;					
				}
				String ans=decimalToOther(Integer.valueOf(n),base);
				System.out.println(ans);
			}
		else 
		{
			int base=0;
			if (convertFrom.equalsIgnoreCase("Binary"))
			{
				base =2;				
			}
			else if (convertFrom.equalsIgnoreCase("Octal"))
			{
				base=8;					
			}
			else if (convertFrom.equalsIgnoreCase("Hexadecimal"))
			{
				base =16;				
			}
			int n2=otherToDecimal(n);
			if (convertTo.equalsIgnoreCase("Binary"))
			{
				System.out.print(decimalToOther(n2,2));
			}
			else if (convertTo.equalsIgnoreCase("Octal"))
			{
				System.out.print(decimalToOther(n2,8));
			}
			else if (convertTo.equalsIgnoreCase("Hexadecimal"))
			{
				System.out.print(decimalToOther(n2,16));
			}
		}
	}
	private static String decimalToOther(int x, int y)
	{
		StringBuilder s= new StringBuilder();
		s = new StringBuilder();
		while(x>0)
		{

			char[] hexrepletters = {'A', 'B', 'C', 'D', 'E', 'F'};
			int d=x%y;
			if (d>=10)
			{
				char hexrep=hexrepletters[d-10];
				s.insert(0, hexrep);
				x=x/y;
			}
			else 
			{
				s.insert(0, d);
			    x=x/y;
			}
		}
		return s.toString();
	}	
	private static int otherToDecimal(String x)
	{
		boolean hex=false;	
		int num;
		for (int i=0;i<x.length();i++)
		{
			char check=x.charAt(i);			
			if (Character.isLetter(check))
				hex=true;
		}
		if (!hex)
		{
			num=Integer.valueOf(x);
			return loopcalc();
		}
		else 
		{
			String n1= "";
			for (int i=10;i<16;i++)
			{
				String[] hexrepletters = {"A", "B", "C", "D", "E", "F"};
				String old=Integer.toString(i);
				System.out.print(old);
				String ch=hexrepletters[i-10];
				System.out.println(ch);
				n1=n1.replaceAll(old, ch);	
				System.out.println(n1+"hi");
			}			
			num=Integer.valueOf(n1);
			return loopcalc();
		}
	}	
	private static int loopcalc()
	{
		int c=0;
		return 0;
	}
}
