import java.util.Scanner;
class add
{
    int a,b,sum;        
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number : ");
        a=sc.nextInt();
        System.out.print("Enter Second Number : ");
        b=sc.nextInt();
    }
    void calculate()
    {
        sum=a+b;
    }
    void display()
    {
        System.out.print("Sum = "+sum);
    }
    public static void main(String[] args)
    {
        add ob=new add();
        ob.getdata();
        ob.calculate();
        ob.display();
    }

}