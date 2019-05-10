import java.util.Scanner;

class Brackets {
    static int c = 0;

    public static void main(String args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        boolean[] b = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                char search = Closer(s.charAt(i));
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == search) {
                        b[c] = true;
                        c++;
                    }
                }
            }
        }
        if (ArrCheck(b))
            System.out.println(true);
        else
            System.out.println(false);
    }

    public static char Closer(char x) {
        if (x == '{')
            return '}';
        else if (x == '[')
            return ']';
        else
            return ')';
    }

    public static boolean ArrCheck(boolean[] x) {
        for (int i = 0; i <= c; i++) {
            if (x[i] == false)
                return false;
        }
        return true;
    }
}