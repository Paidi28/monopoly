
public class Player 
{
	
	
	private String player;
	private String token;
	private int location;
	private int balance;

	public Player()

	{
	        player = "";
	        token = "";
	        location = 0;
	        balance = 1500;
	        player = (player+token+location+balance);

	} 


	public Player(String name, String token, int location, int balance)

	{
	        this.player = name;
	        this.token = token;
	        this.location = location;
	        this.balance = balance;
	
	}
	
	public int getBalance()
	{  
	    return balance;
	}
	
	public void buyHouse(String propName)
	{ 
		
	}
	
	public void buyOccupiedSquare()
	{ 
		
	}
	
	public String toString()
	{  
		return null;
    }
	   
}
