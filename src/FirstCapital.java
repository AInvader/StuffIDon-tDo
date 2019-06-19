import java.util.Scanner;
class FirstCapital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Sentence : ");
        String s=sc.nextLine();
        s=s.trim();
        char first=s.charAt(0);
        first=Character.toUpperCase(first);
        StringBuilder capital= new StringBuilder();
        for(int i=1;i<s.length();i++) {
            char ch=s.charAt(i);
            if (ch==' ') {
                char nextchar;
                nextchar=Character.toUpperCase(s.charAt(i+1));
                capital.append(" ").append(nextchar);
                ++i;
            }
            else
                capital.append(s.charAt(i));
        }
        System.out.print(first+ capital.toString());
    }
}