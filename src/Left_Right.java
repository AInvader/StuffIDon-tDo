import java.util.Scanner;
public class Left_Right {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Perfect Sqaure : ");
        int n=sc.nextInt();
        int matrix_dimension = (int)(Math.sqrt(n));
	    String[][] a = new String[matrix_dimension][matrix_dimension];
        char zero='0';
        int difference = 0; boolean b=false;
        if(digCount(n)>1) {
            difference = digCount(n) - 1;
            b=true;
        }
	    int[] colArray = new int[n];
        for (int i=0;i<n;i++) {
            int d=0;
            colArray[d]=i;
            d++;
            if (i==matrix_dimension-1)
            {
                int c=0;
                i=i-c;
                colArray[d]=i;
                i=matrix_dimension-1;
                c++;

            }
        }
        int rows=0;
        int col=0;
        for (int i=0;i<n;i++) {
                String Stringed_I=Integer.toString(i);
                Stringed_I=Pre_Zero(Stringed_I,difference);
                a[rows][col]=Stringed_I;


        }
    }
    public static int digCount(int x) {
        int c=0;
        while (x>0) {
            c++;
            x=x/10;
        }
        return c;
    }
    public static String Pre_Zero(String x,int diff) {
        for(int i=1;i<=diff;i++) {
            x='0'+x;
        }
        return x;
    }
}
