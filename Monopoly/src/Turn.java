import java.util.Random;

public class Turn 
{

    public static  int rollDice(int number, int nSides)
    { 
        int num = 0;
        int roll = 0;
        Random  r = new Random(); 
        if(nSides >=2) 
        { 
            for(int i = 0; i < number; i++)
            { 
                roll = r.nextInt(nSides)+1;
                System.out.println("Roll is:  "+roll);
                num = num + roll; 
            } 
        } 
        else
        { 
            System.out.println("Error num needs to be from 2"); 
        } 
        return num;  
    } 
    
    
    
    public void endTurn()
    {
    	
    }

    public static void main(String[] args)
    {
        System.out.println("Total is: "+rollDice(2 , 6));
    }
    
    
}