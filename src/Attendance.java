import java.util.Scanner;
class Attendance {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number of Names : ");
		int n=sc.nextInt();
		String[] names = new String[n];
		String[] first_names = new String[n];
		System.out.println("Enter Names : ");
		for (int i=0;i<n;i++) {
			names[i]=sc.nextLine();
		}
		for (int i=0;i<n;i++) {
			first_names[i]=names[i].substring(0,names[i].indexOf(" "));
		}
		int[] same_counter = new int[n];
		same_counter=findSame(first_names);
		for (int i=0;i<n;i++) {
			if (same_counter[i]>0) {
				System.out.print(names[i]);
			}
			else {
				System.out.print(first_names[i]);
			}
		}
	}

	public static int[] findSame(String[] s) {
		int[] same_counter = new int[s.length];
		for (int i=0;i<s.length-1;i++) {
			for (int j=i+1;j<s.length;j++) {
				if (s[i].equals(s[j])) {
					same_counter[i]++;
					same_counter[j]++;
				}
			}
		}
		return same_counter;
	}
}