import java.util.Scanner;
class SetSplit
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of Elements : ");
		int len=sc.nextInt();
		int[] a = new int[len];
		System.out.print("Enter Elements : ");		
		for (int i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
		}
		Sort(a);
		int length=a.length;		
		int split_index_count=0;
		int[] split_indices_current = new int[2];
		int[] split_indices_final = findSplitIndices(length);
		int count=0;
		for (int i=0;i<split_indices_final.length;i++)
		{	
			if (count<split_indices_final.length)
			{
				split_indices_current[0]=split_indices_final[count];
				split_indices_current[1]=split_indices_final[count+1];
				count+=2;
			}
				int sum1=0;
				int sum2=0;
				for (int j=0;j<split_indices_current[0];j++)
				{
					sum1=sum1+a[j];
				}
				for (int j=split_indices_current[0];j<a.length;j++)
				{
					sum2=sum2+a[j];
				}
				if (sum1==sum2)
				{
					System.out.println("True");
					for (int k=0;k<split_indices_current[0];k++)
					{
						System.out.print(a[k]+" ");						
					}
					System.out.println();
					for (int k=split_indices_current[0];k<a.length;k++)
					{
						System.out.print(a[k]+" ");
					}
					break;
				}
				else 
				{
					System.out.println("False");
				}
		}
	}
	private static void Sort(int[] x)
	{
		for (int i=0;i<x.length;i++)
		{
			for (int j=0;j<x.length-1;j++)
			{
				if (x[j]>x[j+1])
				{
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
    }
	private static int[] findSplitIndices(int x)
	{
		int arrlen=(x-1)*2;
		int[] split = new int[arrlen];
		int c=0;
		for(int i=1;i<=x;i++)
		{
			if (i!=x)
			{
				split[c]=i;			
				split[c+1]=x-i;			
				c+=2;
			}
		}
		return split;
	}	
}