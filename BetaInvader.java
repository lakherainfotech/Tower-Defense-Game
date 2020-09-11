// For this invader the health decreses slowly as compare to other invader
public class BetaInvader extends Invader
{
    public BetaInvader(Path path, double health) 
    {
        super(path, health,"Beta Invader");
    }
    

    @Override
    public void decreaseHealth(double factor) 
    {
        setHealth(getHealth()-(factor/2)); // in this type of invader for every factor health decrease only by half
    }

    @Override
    public void move()
    {
         m_pathStep = m_pathStep + 1; // this moves normally one step at a time
    }
    
}
