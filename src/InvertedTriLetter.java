import java.util.Scanner;

class InvertedTriLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of Lines : ");
        int line = sc.nextInt();
        for (int i = line; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64));
            }
            System.out.println();
        }
    }
}