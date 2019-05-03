public class Equal_Sides_Array {
  public static int findEvenIndex(int[] arr) {
      int sum1=0;int sum2=0;
      for (int i=0;i<arr.length;i++)
      {
          for (int j=0;j<i;j++)
          {
            sum1=sum1+arr[j];
          }
          for (int k=i+1;k<arr.length;k++)
          {
            sum2=sum2+arr[k];
          }
          if (sum1==sum2) {
              sum1=0;
              sum2=0;
              return i;
          }
          else {
              sum1=0;sum2=0;
          }
      }      
        return -1;  
  }
  public static void main(String[] args)
  {
	  int[] arr = {2, 4, 6, 5, 6, 4, 2};
      int result=findEvenIndex(arr);
      System.out.print(result);
  }
}