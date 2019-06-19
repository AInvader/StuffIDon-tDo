import java.util.Scanner;
class Search {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number of Elements : ");
		int len=sc.nextInt();
		int[] a = new int[len];
		System.out.println("Enter Element : ");
		for (int i=0;i<len;i++) {
			a[i]=sc.nextInt();			
		}
		System.out.print("Enter Search Element : ");
		int s=sc.nextInt();
		Sort(a);
		int[] b = Search(a, s);
		if (b[0]!=0) {
			System.out.print("Search Element found at "+b[1]);
		}
		else 
			System.out.print("Search Element not found");
	}
	private static void Sort(int[] x) {
		for (int i=0;i<x.length-1;i++) {
			for (int j=1;j<x.length;j++) {
				if (x[i]>x[j]) {
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
	}
	private Search(int[] x, int s) {
		int start=0;int end=x.length-1;int mid=(start+end)/2;
		int[] ret = new int[2];
		for (int i=0;i<ret.length;i++) {
        }
		boolean b;
		while (start<end) {
			if (s == x[mid]) {
				ret[0]=1;				
				ret[1]=mid;
			}
			else if(s<x[mid]) 
				end = mid-1;
			else 
				start = mid+1;
			mid=(start+end)/2;
		}
		return ret;
	}	
}