public class Line 
{
  public static String Tickets(int[] peopleInLine)
  {
        //Your code is here...
        int change =0;        
        for (int i=0;i<peopleInLine.length;i++)
        {
              change=change+peopleInLine[i];
              if (peopleInLine[i]>25)
              		change=change-(peopleInLine[i]-25);                  
              if (peopleInLine[i]-25>change)
              		return "NO";  
        }
        return "YES";        
  }
}