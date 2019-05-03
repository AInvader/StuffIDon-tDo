import java.util.Scanner;
class ClockAngle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Time : ");
        String time=sc.nextLine();
        int colon_pos=time.indexOf(':');
        int hour=Integer.parseInt(time.substring(0,colon_pos));
        int minute=Integer.parseInt(time.substring(colon_pos+1));
        double ang=Angle(hour,minute);
        System.out.print("Angle between Hour hand and Minute Hand = "+ang);
    }
    private static double Angle (int hour, int minute) {
        if (hour>12)
            hour=hour-12;
        if (hour==0)
            hour=12;
        System.out.println("Hours = "+hour+"\nMinutes = "+minute);
        double angle;
        int minute_dev=6;   
        int min5_dev=30;
        double hour_hand_dev = (1.0/2.0)*(double)minute;   
        if (hour==12) {         
            angle=(double)(((minute/5)*30)+(minute%5)*minute_dev)-hour_hand_dev;           
        }
        else {
            double hour_hand_angle=(double)hour*30;
            angle=(double)(((minute/5)*30)+(minute%5)*minute_dev)-hour_hand_angle-hour_hand_dev;            
        }        
        if (angle>180.0)
            angle=360-angle;
        if (angle<0)
            angle=angle*-1;  
        return angle;
    }        
}