import java.util.Scanner;

class ISBN13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        long n = sc.nextLong();
        if (isValid(n))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }

    private static boolean isValid(long n) {
        int sum = 0;
        int c = 12;
        int[] multiplier = {1, 3};
        long check = n % 10;
        n = n / 10;
        while (c >= 1) {
            long d = n % 10;
            n = n / 10;
            if (c % 2 == 0)
                sum = sum + (int) d * multiplier[1];
            else
                sum = sum + (int) d * multiplier[0];
            c--;
        }
        return (sum + check) % 10 == 0;
    }
}