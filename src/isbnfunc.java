class isbnfunc
{
	public static void main(String[] args)
	{
		for (long i=(long)Math.pow(10,10);i<=(long)(Math.pow(10,11))-1;i++) {
			if (isbncheck(i)) {
				System.out.println(i);
			}
		}
	} 
	private static boolean isbncheck(long x)
	{
		long s=0;int c=0;long reverse=0;
		while (x>0)
        {
            long d =x%10;
	        reverse = (reverse*10)+d;
            x=x/10;
        }
        while (reverse>0)
        {
            long d2 = reverse%10;
            c++;
            s=s+(d2*c);
            reverse=reverse/10;
        }
        return s % 11 == 0;
    }
    
}