

public class Square
{
    private String name;
    private int value ;
    
    /*
     * Constructor for objects of class Square
     */
    public Square(String name,int value)
    {
    	this.name = name;
    	this.value = value;
    }

    public void setName(String name)
    {
    	this.name = name;
    }
    public void setValue(int value)
    {
    	this.value = value;
    }

    public String getName()
    {
    	return name ;
    }
    
    
    public int getValue()
    {
    	return value ;
    }
    
    


    public String toString()
    { 
    	return "Name: " + name + "Value"+ value  ;	
    }

}
