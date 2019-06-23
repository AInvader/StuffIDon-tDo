import java.util.Scanner;
class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String : ");
		String s1 = sc.next();
		s1=s1.toLowerCase();
		System.out.print("Enter Second String : ");
		String s2 = sc.next();
		s2=s2.toLowerCase();
		if (isAnagram(s1,s2))
			System.out.print("The words are anagrams");		
		else 
			System.out.print("The words are not anagrams");
	}
	private static boolean isAnagram(String s1,String s2) {
		if (s1.length() != s2.length())
			return false;
		else {
			return CharacterCheck(s1, s2) && CharacterCheck(s2, s1);
		}
	}
	private static boolean CharacterCheck (String s1,String s2) {
		boolean b = false;
		for (int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			for (int j=0;j<s2.length();j++) {
				if (s2.charAt(j) == ch)
					b = true;
				else if (!b && j == s2.length()-1)
					return false;
			}
		}
		return true;
	}
}