import java.util.Scanner;
class Clock_Words {
	private static final String [] words;

	static {
		words = new String[]{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen"
				, "Fourteen", "Quarter", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"};
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter hours : ");
		int h=sc.nextInt();
		System.out.print("Enter Minutes : ");
		int m=sc.nextInt();
		System.out.print(giveTime(h,m));
	}
	private static String giveTime (int h , int m) {
		String time;
		if (h > 12)
			h=h-12;

		if (m<30) {
			if (m==0)
				time = words[h] + " o'clock";
			else {
				if (m<=20) {
					if (m==15)
						time = words[m] + " past "+ words[h];
					else {
						if (m!=1)
							time = words[m] + " minutes past " + words[h];
						else 
							time = words[m] + " minute past " + words[h];
					}
				}
				else {
					time = OverTwenty(m) + " minutes past " + words[h];
				}
			}
		}
		else {
			int Plus_Hour;
			if (h != 12)
				Plus_Hour = h+1;
			else
				Plus_Hour = 1;
			if (m==30) 
				time = "Half past " + words[h];
			else if ((60-m) != 15) {
				if ((60-m) != 1)
					time = OverTwenty(m) + " minutes to " + words[Plus_Hour];
				else 
					time = words[60-m] + " minute to " + words[Plus_Hour];
			}
			else 
				time = words[15] + " past " + words[Plus_Hour];
		}			
		return time;	  
	}
	private static String OverTwenty(int m) {
		if (m<=20)
			return words[m];
		else 
			return ("Twenty " + words[m%20]);
	}
}