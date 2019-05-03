import java.util.Scanner;

public class bubblesort
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Elements : ");
        int n=sc.nextInt();
	    int[] a = new int[n];
        System.out.println("Enter Elements : ");
        for (int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        int commcount=0;
        for (int i=0;i<n;i++)
        {
            for (int j=1;j<n;j++)
            {
                if (a[j-1]>a[j])
                {                  
                    int s=a[j];
                    a[j]=a[j-1];
                    a[j-1]=s;
                }
            }
        }
        System.out.println("Ascending Order : ");
        for (int p=0;p<n;p++)
        {
        	commcount++;
        	if (commcount<n)
        		System.out.print(a[p]+",");
        	else
        		System.out.print(a[p]);
        }
    }
}