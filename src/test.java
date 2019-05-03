class test
{
    public static void main(String[] args)
    {
	    int[] a = {1, 2, 3, 4, 5};
        mult(a);
        
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    static int[] mult(int[] x)
    {
        for (int i=0;i<x.length;i++)
        {
            x[i]=x[i]*2;
        }
        return x;
    }
}