import java.util.Scanner;

class CheckSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        long n = sc.nextLong();
        int[] a;
        a = putInArray(n);
        if (isValid(a))
            System.out.print("Valid");
        else
            System.out.print("Not Valid");
    }

    private static boolean isValid(int[] a) {
        int len = a.length;
        a = revArr(a);
        int check = a[len - 1];
        int sum = 0;
        for (int i = len - 2; i >= 0; i--) {
            if ((len - 1 - i) % 2 != 0) {
                a[i] = 2 * a[i];
                if (a[i] > 9)
                    a[i] = a[i] - 9;
            }
        }
        for (int i = 0; i < len - 1; i++) {
            sum = sum + a[i];
        }
        sum = sum * 9;
        int unit = sum % 10;
        return unit == check;
    }

    private static int[] revArr(int[] a) {
        int c = 0;
        int[] copy = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            copy[c] = a[i];
            c++;
        }
        return copy;
    }

    private static int digcount(long n) {
        int c = 0;
        while (n > 0) {
            c++;
            n = n / 10;
        }
        return c;
    }

    private static int[] putInArray(long n) {
        int c = 0;
        int[] a = new int[digcount(n)];
        while (n > 0) {
            long d = (n % 10);
            a[c] = (int) d;
            c++;
            n = n / 10;
        }
        return a;
    }
}