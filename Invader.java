/**
 * An invader starts from the beginning to a given path and tries to reach to 
 * the path end.
 * @author (Ashek Ahmmed)
 * @version (7-5-2019)
 */

abstract public class Invader  // creating class abstarct 
{
    private final Path m_path;//once the path is passed on, it can't be altered
    private double m_health;//reflects the health of an invader
    protected int m_pathStep;//for tracking where on the path, the invader is.
    private String invader_type;// to tack which type of invader is present
            
    public Invader(Path path, double health, String invader_type)
    {
        m_pathStep = 0; //we always start from the beginning of the path
        m_path = path;
        m_health = health; //sets the initial health
        this.invader_type = invader_type;
    }
    
    public double getHealth()
    {
        return m_health;
    }
    
    public void setHealth(double health)
    {
        m_health = health;
    }

    public String getInvader_type() 
    {
        return invader_type;
    }
    
    
    //the health gets decreased at each successful shot
    abstract public void decreaseHealth(double factor);// this method is declared abstract do that the child class of invader can use this method
    
    
    //the invader needs to move, advance on the path.
    //you can also define getters and setters for the m_pathStep field and
    //use them here. 
    
    abstract public void move(); // this method is declared abstract do that the child class of invader can use this method 
    
        
    //need to know an invader's current location on the map.
    //the Path class contains a method to answer this. so let's use that method.
    
    public MapLocation getLocation()
    {
        return m_path.getLocationAt(m_pathStep);
    }
    
    //is the invader at the path end? return true if yes.
    public boolean hasScored()
    {
        return (m_pathStep >= m_path.getPathLength());
    }
    
    //is the invader dead?
    public boolean isNeutralized()
    {
        return (m_health <=0);//returns true if the health is 0 or -ve
    }
    
    //an invader is active, if it is not at the path end and it is not dead
    public boolean isActive()
    {
        return (!hasScored() && !isNeutralized());
    }
}
