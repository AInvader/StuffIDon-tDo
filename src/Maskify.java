import java.util.Scanner;

class Maskify
{
    private static String maskify(String str)
    {        
        int len=str.length();
        StringBuilder mask= new StringBuilder();
        for (int i=0;i<len-4;i++)
        {
            mask.append("#");
        }
        for (int i=len-4;i<len;i++)
        {
            mask.append(str.charAt(i));
        }
        return mask.toString();
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
