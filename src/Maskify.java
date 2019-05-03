import java.util.Scanner;

public class Maskify
{
    public static String maskify(String str) 
    {        
        int len=str.length();
        String mask= "";
        for (int i=0;i<len-4;i++)
        {
            mask=mask+"#";
        }
        for (int i=len-4;i<len;i++)
        {
            mask=mask+str.charAt(i);
        }
        return mask;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter String : ");
        String s=sc.nextLine();
        String masked=maskify(s);
        System.out.print(masked);
    }
}
