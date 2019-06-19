import java.util.Scanner;

class add {
    private int a;
    private int b;
    private int sum;

    public static void main(String[] args) {
        add ob = new add();
        ob.getdata();
        ob.calculate();
        ob.display();
    }

    private void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        b = sc.nextInt();
    }

    private void calculate() {
        sum = a + b;
    }

    private void display() {
        System.out.print("Sum = " + sum);
    }

}