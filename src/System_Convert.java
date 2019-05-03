import java.util.Scanner;
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
			int n2=otherToDecimal(n,base);
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
	static String decimalToOther(int x,int y)
	{
		String s= "";
		s="";
		while(x>0)
		{

			char[] hexrepletters = {'A', 'B', 'C', 'D', 'E', 'F'};
			int d=x%y;
			if (d>=10)
			{
				char hexrep=hexrepletters[d-10];
				s=hexrep+s;
				x=x/y;
			}
			else 
			{
				s=d+s;			
			    x=x/y;
			}
		}
		return s;
	}	
	static int otherToDecimal(String x,int y)
	{
		boolean hex=false;	
		int num;
		for (int i=0;i<x.length();i++)
		{
			char check=x.charAt(i);			
			if (Character.isLetter(check)==true)
				hex=true;
		}
		if (hex==false)
		{
			num=Integer.valueOf(x);
			int sum=loopcalc(num,y);
			return sum;
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
			int ans=loopcalc(num,16);
			return ans;
		}
	}	
	static int loopcalc(int x,int y)
	{
		int c=0;	
		int sum=0;
		for (int i=0;i<c;i++)
		{
			int d=x%10;
			sum=sum+d*(int)Math.pow(y,i);
		}
		return sum;
	}
}
