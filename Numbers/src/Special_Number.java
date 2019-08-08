import java.util.Scanner;
class Special_Number 
{
    public static void main(String args[]) 
    {
        int s=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int copy=n;
        while (n>0)
        {
            int d=n%10;
            s=s+ factorial(d);
            n=n/10;
        }
        if (s==copy)
            System.out.println("Special Number");
        else
            System.out.println("Not a Special Number");
    }
    public static int factorial(int x)
    {
        int f=1;
        for (int i=1;i<=x;i++)
            f=f*i;
        return f;
    }
}