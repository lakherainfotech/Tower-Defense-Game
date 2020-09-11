
/**
 * A map is of dimension (width x height) and has non-overlapping positions.
 * So a position within the map can be specified using Cartesian coordinates.
 * (0,0) is the bottom-left position of the coordinate frame.
 * A point refers to (x = width, y = height) on the map.
 * @author (Ashek Ahmmed)
 * @version (24-4-2019)
 */
public class Map
{
    private final int map_width;
    private final int map_height;
    
    public Map(int m_w, int m_h)
    {
        map_width = m_w;
        map_height = m_h;
    }
    
    public int getMapWidth()
    {
        return map_width;
    }
    
    public int getMapHeight()
    {
        return map_height;
    }
}
