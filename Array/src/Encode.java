import java.util.Scanner;
class Encode
{
    String s=new String(); int key;char ch,newch;int len,chnum; String encstring = new String();char a[]=new char[100];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        s=sc.nextLine();
        len=s.length();     
        System.out.print("Enter Key : ");
        key=sc.nextInt();
    }
    void encode()
    {
        for (int i=0;i<len;i++)
        {
            ch=s.charAt(i);
            chnum=(int)(ch);
            chnum=chnum+key;
            newch=(char)(chnum);
            a[i]=newch;
        }
    }
        void display()
    {
        System.out.print("Encoded String : ");
        for (int i=0;i<len;i++)
        {
            System.out.print(a[i]);
        }
    }
    void main()
    {
        Encode ob=new Encode();
        ob.input();
        ob.encode();
        ob.display();
    }
}