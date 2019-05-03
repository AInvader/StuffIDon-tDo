import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabeticalOrder {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number of Words : ");
		int n=Integer.parseInt(br.readLine());
		String[] a=new String[n];
		System.out.println("Enter "+n+" words :");
		for (int i=0;i<n;i++) {
			a[i]=br.readLine();
		}
		for (int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if (a[i].compareTo(a[j])>0) {
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
