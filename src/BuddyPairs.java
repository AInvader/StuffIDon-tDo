class BuddyPairs {
    public static String buddy(long start, long limit) {
        for (long n=start;n<limit;n++) {
        	int factorsOfn=numberofFactors(n);
        	for (long m=n+1;m>n;m++) {
        		int factorsOfm=numberofFactors(m);
        		if (factorsOfm==n+1 && factorsOfn == m+1) {        			
                    return (n+" "+m);
                }                
           	}
            break;
        }
        return "Nothing";
    }
    public static int numberofFactors(long x) {
    	int c=0;
    	for (int i=1;i<x;i++) {
    		if (x%i==0)
    			c++;
    	}
    	return c;
    }
}
 