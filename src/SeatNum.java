import java.util.Scanner;
class SeatNum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Seat Number : ");
        int seat=sc.nextInt();
        int columns=findColumns(seat);
        String seatpos=findpos(columns);
        System.out.println(seatpos+" seat");
        int oppseat=findOppSeat(seat);
        System.out.print("Opposite Seat :"+oppseat);        
    }
    private static int findRows(int x)
    {
        int rows;
        if (x%6!=0)
            rows=(x/6)+1;
        else 
            rows=(x/6);
        return rows;
    }
    private static int findColumns(int x)
    {
        int rows=findRows(x);
        int columns;
        if (rows%2==0)
        {
            int max_seat=6*rows;
            columns=(max_seat-x)+1;
        }
        else 
        {
            columns=x-(rows-1)*6;
        }
        return columns;
    }
    private static String findpos(int x)
    {
        if (x==1 || x==6)
            return "Window";
        else if (x==2 || x==5)
            return "Middle";
        else 
            return "Aisle";  
    }
    private static int findOppSeat(int x)
    {
        int oppseat;
        int rows=findRows(x);
        int columns=findColumns(x);
        if (rows%2!=0)
        {
            oppseat=findSeatNumber(rows+1,columns);
        }
        else 
        {
            oppseat=findSeatNumber(rows-1,columns);
        }
        return oppseat;
    }
    private static int findSeatNumber(int rows,int columns)
    {
        int SeatNumber=0;
        for (int i=1;i<=24;i++)
        {
            int rows1=findRows(i);
            int columns1=findColumns(i);
            if (rows1==rows && columns1==columns)
                SeatNumber=i;
        }
        return SeatNumber;
    }
}
