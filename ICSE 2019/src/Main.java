import java.util.*; 
import java.io.*;

class Main {  
  public static int TimeConvert(int num) { 
  
   int hours=num/60;
   String hr=String.valueOf(hours);
   int minute=num%60;
   String min=String.valueOf(minute);
   String hourmin = hr+min;
   return hourmin;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(TimeConvert(s.nextLine())); 
  }   
  
}

