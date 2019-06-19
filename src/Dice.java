import java.util.Random;

class Dice {

    private static  int rollDice()
    { 
        int num = 0;
        int roll;
        Random  r = new Random(); 
        if(6 >=3)
        { 
            for(int i = 0; i < 3; i++)
            { 
                roll = r.nextInt(6)+1;
                System.out.println("Roll is:  "+roll);
                num = num + roll; 
            } 
        } 
        else
        { 
            System.out.println("Error num needs to be from 3"); 
        } 
        return num;  
    } 

    public static void main(String[] args)
    {
        System.out.println("Total is: "+rollDice());
    }
}