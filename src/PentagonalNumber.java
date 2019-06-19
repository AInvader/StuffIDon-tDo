import java.util.Scanner;
class PentagonalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Iterations : ");
        int n=sc.nextInt();
        System.out.print("Number of Iterations at "+n+"th iteration : "+DotCount(n));
    }
    private static int DotCount(int n) {
        return ((3*n*n)-n)/2;
    }
}