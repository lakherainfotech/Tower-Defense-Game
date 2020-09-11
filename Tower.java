
/**
 * A tower shoots at invaders that are within its range and thereby
 * reduces their lives. When placed on a map, a tower can not move from that
 * position. Also towers can not be on the same path of the invaders.
 *
 * @author (Ashek Ahmmed)
 * @version (7-5-2019)
 */
abstract public class Tower
{
    protected final MapLocation m_location;//each tower is on the map.
    protected final double m_range;//shooting range of an invader
    protected final double m_power;//how much life of an invader, the tower can reduce with each shot
    //private final double m_accuracy;//the shooting accuracy of a tower
    
    //public Tower(MapLocation location, double range, double power, double accuracy)
    public Tower(MapLocation location, double range, double power)
    {
        m_location = location;
        m_range = range;
        m_power = power;
        //m_accuracy = accuracy;
    }
    
    
    //checks whether a given invader is within range of the current tower
    abstract public boolean inRangeOf(Invader invader);
    
    abstract public void fireOnInvaders(Invader[] invaders);
    
}
