import java.util.Scanner;

public class AddEquals {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers to Add : ");
        while (true) {
            if (sc.hasNextInt())
                sum = sum + sc.nextInt();
            else {
                System.out.println(sum);
                break;
            }
        }
    }
}
