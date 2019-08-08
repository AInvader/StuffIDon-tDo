import java.util.*;
public class ArrayComposition {
	private static Scanner sc;
	public static void main (String args[]) {
	sc = new Scanner (System.in);int frequency=0;
    System.out.print ("Enter No. of Elements in List : ");
    int len=sc.nextInt();
    int a [] = new int [len];
    for (int i=0;i<len;i++)
    {
      System.out.print("Enter Elment "+ i + " : ");
      a[i]=sc.nextInt();
    }
    System.out.print ("Enter Element whose frequency is to be checked : ");
    int freqnum =sc.nextInt();
    for (int i=0;i<len;i++)
    {
    	if (a[i]==freqnum)
    		frequency++;
    }
    	double freqdouble=(double)frequency;
    	double lendouble=(double)len;
        System.out.println("Frequency = "+frequency);    	 	
    	double percentage=(freqdouble/lendouble)*100.0; 
    	System.out.print(percentage+"%");    	
    }
}