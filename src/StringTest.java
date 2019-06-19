class StringTest {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		System.out.println(IntegerArraytoString(a));
		System.out.println(StringRev("Hello"));
	}
	public static String IntegerArraytoString (int[] x){
		char[] a = new char[x.length];
		for(int i=0;i<x.length;i++) {
			a[i]=(char)(x[i]+48);
		}
        return String.valueOf(a);
	}
	public static String StringRev (String s) {
		StringBuilder rev= new StringBuilder();
		for (int i=s.length()-1;i>=0;i--) {
			rev.append(s.charAt(i));
		}
		return rev.toString();
	}
}

