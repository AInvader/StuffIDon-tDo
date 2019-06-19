import java.util.Scanner;
class OddSort {
	private static int c=0;
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of Terms in Array : ");
		int n=sc.nextInt();
		int[] a = new int[n];
		System.out.print("Enter Elements : ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++) {
			for (int j=1;j<n;j++) {				
				if (odd(a[j])) {
					int nextOddIndex=findNextOddIndex(a,j);
					if (a[j]>a[nextOddIndex])
						swap(a,j,a[nextOddIndex]);
				}
			}
		}
		System.out.print("Ascending Order : ");
		printArray(a);
	}

	public static void printArray(int[] a) {
		for (int value : a) {
			System.out.print(value + "  ");
		}
	}

	private static int findNextOddIndex(int[] a, int index) {
		++c;
		for (int i=index+1;i<a.length;++i) {
			if (odd(a[i])) {
				if (c==1)
					return i-1;
				else
					return i;
			}
		}
		return index;
	}
	public static void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	private static boolean odd(int x) {
		return x % 2 != 0;
	}
}