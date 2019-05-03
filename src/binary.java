import java.util.Scanner;
class binary
{
	public static void main(String[] args) 
	{		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Search Term: ");
		int search=sc.nextInt();
		int[] a = {1, 2, 3, 4, 5};
		int firstpos=0;
		int lastpos=a.length;
		while (firstpos<lastpos)
		{
            int mid=((firstpos+lastpos)/2)+1;
			if (a[mid]==search)
			{
				System.out.print("Position ="+mid);
				break;
			}
			else if (a[mid]<search)
			{
				firstpos=mid+1;
			}
			else if (a[mid]>search)
			{
				lastpos=mid-1;
			}
			else
            {
                System.out.print("Search Term not Found");
            }
		}
	}
}