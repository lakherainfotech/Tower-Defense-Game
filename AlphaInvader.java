// this a type of invader which moves faster as compare to the normal invader
public class AlphaInvader extends Invader
{
    public AlphaInvader(Path path, double health) {
        super(path, health,"Alpha Invader");
    }
    
    @Override
    public void decreaseHealth(double factor)
    {
        setHealth(getHealth()-factor);
    }

    @Override
    public void move()
    {
        m_pathStep = m_pathStep + 2; //this invader moves two steps at a time
    }
    
}
