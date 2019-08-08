import java.util.Scanner;

class digitBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int[] a = putInArray(n);
        final int[] b = putInArray(n);
        int k = 0;
        int step_count = 1;
        for (int j = 0; j < digcount(n); j++) {
            for (int i = 0; i < a.length - 1; i++)
                if (a[i] == 0) break;
                else if (digcount(a[i]) + k < b.length) {
                    a[i] = (a[i] * 10) + b[digcount(a[i]) + k];
                    k++;
                }
            a[a.length - 1] = 0;
            for (int i = 0; i < a.length - step_count; i++) {
                if (i == (a.length - step_count) - 1)
                    System.out.print(a[i]);
                else
                    System.out.print(a[i] + ",");
            }
            System.out.println();
            k = 0;
            step_count++;
        }
    }

    private static int[] putInArray(int n) {
        n = Reverser(n);
        int[] a = new int[digcount(n)];
        for (int i = 0; i < a.length; i++) {
            a[i] = n % 10;
            n = n / 10;
        }
        return a;
    }

    private static int Reverser(int n) {
        int reverse = 0;
        while (n > 0) {
            int d = n % 10;
            reverse = (reverse * 10) + d;
            n = n / 10;
        }
        return reverse;
    }

    private static int digcount(int n) {
        int c = 0;
        while (n > 0) {
            n = n / 10;
            c++;
        }
        return c;
    }
}