
/**
 * To objective is to specify where on the map an object(invader,tower) is.
 *
 * @author (Ashek Ahmmed)
 * @version (24-04-2019)
 */
public class MapLocation extends Point
{
    public MapLocation(){}
    
    public MapLocation(int x, int y, Map map)
    {
        //with x and y, we call the base class constructor i.e. Point's constructor
        super(x,y);
    }
}
