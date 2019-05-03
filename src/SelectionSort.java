public class SelectionSort {
	public static void main(String[] args) {
		int[] a = {77, 12, 67, 80, -3};
		for (int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if (a[j]<a[i]) {
					OddSort.swap(a,i,j);
				}
			}
		}
		OddSort.printArray(a);
	}
}
