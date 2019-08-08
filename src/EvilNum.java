import java.util.Scanner;

class EvilNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int bin = toBinary(n);
        System.out.println("Binary : " + bin);
        if (isEvil(bin))
            System.out.print("Evil Number");
        else
            System.out.print("Not Evil");
    }

    private static int toBinary(int n) {
        int s = 0;
        while (n > 0) {
            s = (s * 10) + (n % 2);
            n = n / 2;
        }
        return (toReversed(s));
    }

    private static int toReversed(int n) {
        int reverse = 0;
        while (n > 0) {
            int d = n % 10;
            reverse = (reverse * 10) + d;
            n = n / 10;
        }
        return reverse;
    }

    private static boolean isEvil(int bin) {
        int c = 0;
        while (bin > 0) {
            int d = bin % 10;
            if (d == 1)
                c++;
            bin /= 10;
        }
        return c % 2 == 0;
    }
}