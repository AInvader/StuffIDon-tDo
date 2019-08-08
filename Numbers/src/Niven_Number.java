import java.util.Scanner;

public class Niven_Number {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int copy=n;int s=0;
while (n>0)
{
    int d=n%10;
    s=s+d;
    n=n/10;}
if (copy%s==0)
    System.out.println("Niven");
else
    System.out.println("Not Niven");
    }
}