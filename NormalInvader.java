// this is a normal invader which moves and losses health normally
public class NormalInvader extends Invader
{

    public NormalInvader(Path path, double health) {
        super(path, health,"Normal Invader");
    }
    

    @Override
    public void decreaseHealth(double factor)
    {
       setHealth(getHealth()-factor); //Health decreases normally
    }

    @Override
    public void move() {
        m_pathStep = m_pathStep + 1; //This moves normally
    }
    
}
