import java.util.*;
class ArrAscOrd
{
    public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter the No. of elements in array : ");
  int len=sc.nextInt(); 
  int a[]=new int [len];
  for (int i=0;i<len;i++)
    {
        System.out.print("Enter Element "+(i+1)+" of Array : ");
       a[i]=sc.nextInt();
    }
  for (int i=0;i<len;i++)
    {
      for (int j=i+1;j<len;j++)
      {
        if (a[j]<a[i])
        {
          int c=a[i];
          a[i]=a[j];
          a[j]=c;
        }
      }
    }
    System.out.print("Ascending Order : ");
  for (int i=1;i<len;i++)
    System.out.print(a[i]+" ");
  System.out.print("Enter Search Term : ");
  int search=sc.nextInt();
  int firstindex = 0; 
  int lastindex = len-1;    
  while(firstindex<=lastindex)
     {
        int midindex = ((firstindex+lastindex)/2);
        if (search ==a[midindex])
          {System.out.println ("Position of search term :  "+midindex);
          break;}       
          	else if (search <a[midindex])
          lastindex=midindex-1;
        else
          firstindex = midindex+1;
     }
    }
}
