import java.util.Scanner;
public class Combination
{
    static int c=0;
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Word : ");
        String str = sc.nextLine();
        int n = str.length();
        combine(str, 0,n-1);
    }    
    public static void combine(String str, int start, int end)
    {
        if (start == end) {
            System.out.print(str+"  ");
            c++;
            if (c==10) {
                System.out.println();
                c=0;
            } 
        }
        else
        { 
            for (int i = start; i <= end; i++) 
            { 
                str = Swap(str,start,i); 
                combine(str, start+1, end);
                str = Swap(str,start,i); 
            } 
        } 
    }    
    public static String Swap(String str, int i, int j)
    {         
        char[] word = str.toCharArray();
        char temp = word[i]; 
        word[i] = word[j]; 
        word[j] = temp; 
        return (String.valueOf(word));
    }  
} 