// range is more for this tower
public class BetaTower extends Tower{

    public BetaTower(MapLocation location, double range, double power) {
        super(location, range+0.25, power);
    }

    
     @Override
    public boolean inRangeOf(Invader invader)
    {
        return (invader.getLocation().distanceTo(m_location) <= m_range);
    }

    @Override
    public void fireOnInvaders(Invader[] invaders) {
     
        for(int i = 0; i < invaders.length; i++)
        {
        
            
            if(invaders[i].isActive() && inRangeOf(invaders[i])&&(invaders[i].getHealth()>=0))
            {
                System.out.print("Tower at ");
                m_location.printLocation();
                System.out.print(" managed to hit an "+invaders[i].getInvader_type()+" invader at ");
                invaders[i].getLocation().printLocation();
                invaders[i].decreaseHealth(m_power);
                System.out.println();
                System.out.print(invaders[i].getInvader_type()+"Invader's current health:");
                System.out.println(invaders[i].getHealth());
                if(invaders[i].getHealth() == 0)
                {
                    System.out.println(invaders[i].getInvader_type()+" is dead");
                }
            
            }
            
        }
        
    }
    
}
