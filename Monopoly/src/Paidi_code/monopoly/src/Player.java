

/*
 * This is a Player class that stores and maintains the info of a staff member
 * @author Padraig O Neill
 * @version 1
 */

public class Player
{
    private String name;
    private int money;
    private int boardPosition;

    /*
     * Constructor for objects of class Player
     */
    public Player(String name, int money,int boardPosition)
    {
    	this.name = name;
    	this.money = money;
    	this.boardPosition = boardPosition;
    }

  
    public void setName(String name)
    {
    	this.name = name;
    }

    public void setMoney(int money)
    {
    	this.money = money;
    }
    
    public void setBoardPosition(int boardPosition)
    {
    	this.boardPosition = boardPosition;
    }

    public String getName()
    {
    	return name ;
    }
    
    public int getMoney()
    {
    	return money;
    }
 
    public int getBoardPosition()
    {
    	return boardPosition;
    }
    
    public String toString()
    { 
    	return "Name: " + name ;	
    }

}
