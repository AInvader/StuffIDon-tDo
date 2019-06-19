import java.util.Scanner;
class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.nextLine();
        StringBuilder unique= new StringBuilder();
		unique.append(s.charAt(0));
		for (int i=1;i<s.length();i++) {
			for (int j=0;j<unique.length();j++) {
				if (s.charAt(i)!=unique.charAt(j) && j==unique.length()-1) {
                    unique.append(s.charAt(i));
                }
			}			
		}
		System.out.print(unique);		
	}
}