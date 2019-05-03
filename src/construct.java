import java.util.*;
class construct
{
     
        int copy; int d; int rev; int n;
        void construct()
        {
            copy=n;
            d=0;
            rev=0;
        }
        void getdata()
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Number");
            n=sc.nextInt();
        }
        void reverse()
        {
            while(n>0){
            d=n%10;
            rev=(rev*10)+d;
            n=n/10;
        }
        }
        void showresult()
        {
	 		System.out.print("Reverse : "+rev);
	}
	public static void main(String[] args)
	{
	    construct ob=new construct();
	    ob.getdata();
	    ob.construct();
    	    ob.reverse();
    	    ob.showresult();
}
}