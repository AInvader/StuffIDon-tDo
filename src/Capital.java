import java.util.Scanner;

class Capital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence : ");
        String s = sc.nextLine();
        System.out.print(Capitalize(s));
    }

    public static String Capitalize(String x) {
        String ret = "";
        ret = ret + Character.toUpperCase(x.charAt(0));
        for (int i = 1; i < x.length(); i++) {
            if (x.charAt(i) == ' ') {
                ret = ret + " ";
                ret = ret + Character.toUpperCase(x.charAt(i + 1));
                i++;
            } else
                ret = ret + x.charAt(i);
        }
        return ret;
    }
}