import java.util.ArrayList;

public class Players
{
  private ArrayList<Player> players; 
 /*
  * Constructor for objects of class Department
  */
  public Players(String title, String manager)
  {;
	    players =new ArrayList<Player>();
  }
  
  public void addPlayer(Player player)
  {
	  players.add(player);
  }
  

  public Player getStaff(int index)
  {
	  return players.get(index);
  }

  public void setMonopolyPlayers(ArrayList<Player> monopolyPlayers)
  {
	  this.players= monopolyPlayers;
  }
  
     
  public ArrayList<Player> getDepartmentStaff()
  {
	  return players;
  }
    	     
  
 /*
  * toString() - This method returns the String version of the 
  * department object.
  * @return     the string version of the department object.
  */
  public String toString()
  {
	  return "Players:  " + players ;
  }
}
	  
  
 