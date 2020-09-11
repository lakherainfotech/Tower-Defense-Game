
/**
 * Path refers to the straight path through which all the invaders travel.
 *
 * @author (Ashek Ahmmed)
 * @version (24-4-19)
 */
public class Path
{
    private MapLocation[] m_path;
    
    public Path(){}
    
    public Path(MapLocation[] path)
    {
        m_path = path;
    }
    
    public MapLocation[] getPath()
    {
        return m_path;
    }
    
    //this method returns the length of a path
    public int getPathLength()
    {
        return m_path.length;
    }
    
    
    //this method returns where (maplocation) on the path, an invader is currently located.
    public MapLocation getLocationAt(int pathStep)
    {
        return m_path[pathStep];
    }
    
}
