import java.util.Scanner;
class PentagonalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Iterations : ");
        int n=sc.nextInt();
        System.out.print("Number of Iterations at "+n+"th iteration : "+DotCount(n));
    }
    public static int DotCount(int n) {
        int dots = ((3*n*n)-n)/2;
        return dots; 
    }
    public static void Driver() {
        for (int i=1;i<10;i++) {
            System.out.println(DotCount(i));
        }
    }
}