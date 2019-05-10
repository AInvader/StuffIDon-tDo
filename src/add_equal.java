import java.util.Scanner;

class add_equal {
    public static void main(String[] args) {
        char c;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers to be added : ");
        while (true) {
            try {
                int n = sc.nextInt();
                sum = sum + n;
            } catch (Exception e) {
                c = sc.next().charAt(0);
                if (c == '=')
                    System.out.print("Sum = " + sum);
                break;
            }
        }
    }
}