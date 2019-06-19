import java.util.Scanner;
class Insert {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of Elements in Array : ");
		int len=sc.nextInt()+1;
		int[] a = new int[len];
		System.out.println("Enter Elements : ");
		for (int i=0;i<len-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter Element to be Inserted and Position : ");
		int x=sc.nextInt();
		int pos=sc.nextInt();
		int lostVal=a[pos+1];
		for (int i=pos+1;i<a.length-1;i++) {
			a[i]=lostVal;
			pos++;
			lostVal=a[i];
		}
		a[pos]=x;
		OddSort.printArray(a);
	}
}
