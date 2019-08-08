import java.util.*;
class Sort
{
    int a[]={-23,2,4,6,8,0,1,6,5,1,7};
    int len=a.length; Scanner sc=new Scanner(System.in);
    boolean anscheck; int midindex;
    void arrange()
    {
        for (int i=1;i<10;i++)
        {
            for (int j=1;j<10;j++)
            {
                if (a[j-1]>a[j])
                {
                    //swap
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        System.out.print("Ascending Order : ");
        for (int p=0;p<10;p++)
        {
            System.out.print(a[p]+" ");
        }
    }
    void search()
    {
        System.out.print("Enter Search Term : ");
        int search=sc.nextInt();
        int firstindex=0;
        int lastindex=len-1;        
        while (firstindex<=lastindex)
        {
            midindex=((firstindex+lastindex)/2);
            if (search==a[midindex])
            {
                int ans= midindex;
                anscheck=true;
                break;
            }
            else if(search>a[midindex])
            {
                firstindex=midindex+1;               
            }
            else if (search<a[midindex])
            {
                lastindex=midindex-1;
            }            
        }
        if (anscheck!=true)
        {
            System.out.print("Search is Unsucessful");
        }
        else if (anscheck==true)
        {
            System.out.print("Position of Search term : "+midindex);
        }
    }
    void main()
    {
        Sort ob=new Sort();
        ob.arrange();
        ob.search();
    }
}