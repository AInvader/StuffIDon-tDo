import java.util.Scanner;
class FirstCapital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Sentence : ");
        String s=sc.nextLine();
        s=s.trim();
        char first=s.charAt(0);
        first=Character.toUpperCase(first);
        String capital="";
        for(int i=1;i<s.length();i++) {
            char ch=s.charAt(i);
            if (ch==' ') {
                char nextchar=s.charAt(i+1);
                nextchar=Character.toUpperCase(s.charAt(i+1));
                capital=capital+" "+nextchar;
                ++i;
            }
            else
                capital=capital+s.charAt(i);
        }
        System.out.print(first+capital);
    }
}