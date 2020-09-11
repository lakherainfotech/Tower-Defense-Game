
/**
 * A point refers to a particular location over the map.
 * Points have some properties like, no two points can share the same location.
 * We can calculate the distance between two points. But since points coordinates
 * can only be integers for our game, so their distance is also integer not double.
 * @author (Ashek Ahmmed)
 * @version (7-5-2019)
 */

import java.lang.Math;//library that contains the definition for square root method

public class Point
{
    private int p_x;
    private int p_y;
    
    public Point(){}
    
    public Point(int x, int y)
    {
        p_x = x;
        p_y = y;
    }
    
    public int getX()
    {
        return p_x;
    }
    
    public int getY()
    {
        return p_y;
    }
    
    //calculates the distance between two points, here between current point 
    // and given point p
    public int distanceTo (Point p)
    {
        int xDiff = getX() - p.getX();
        int yDiff = getY() - p.getY();
        
        return (int)Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    
    //because we are interested to know about locations,
    //so added a method to print that out
    public void printLocation()
    {
        System.out.print("(" + getX() + "," + getY() + ")");
    }
}
