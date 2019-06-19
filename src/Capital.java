import java.util.Scanner;

class Capital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence : ");
        String s = sc.nextLine();
        System.out.print(Capitalize(s));
    }

    private static String Capitalize(String x) {
        StringBuilder ret = new StringBuilder();
        ret.append(Character.toUpperCase(x.charAt(0)));
        for (int i = 1; i < x.length(); i++) {
            if (x.charAt(i) == ' ') {
                ret.append(" ");
                ret.append(Character.toUpperCase(x.charAt(i + 1)));
                i++;
            } else
                ret.append(x.charAt(i));
        }
        return ret.toString();
    }
}