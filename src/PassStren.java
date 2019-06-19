import java.util.Scanner;

class PassStren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password : ");
        String pass = sc.nextLine();
        int stren = 0;
        int len = pass.length();
        stren = stren + (len * 3);
        for (int i = 0; i < len; i++) {
            char ch = pass.charAt(i);
            int ch1 = (int) ch;
            if (ch1 >= 97 && ch1 <= 122)
                stren += 2;
            else if (ch1 >= 48 && ch1 <= 57)
                stren += 3;
            else if (ch1 >= 33 && ch1 <= 47 || ch1 >= 58 && ch1 <= 64)
                stren += 4;
        }
        System.out.println("Strength : " + stren);
        long totalcomb = (long) Math.pow(95, len);
        System.out.print(totalcomb);
    }
}