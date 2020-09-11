
/**
 * A level consists of a map, a path, an array of invaders and an array of towers.ion of class Level here.
 * So it is possible to create different levels with different maps, paths, etc.
 * @author (Ashek Ahmmed)
 * @version (7-5-2019)
 */
public class Level
{
    private Invader[] m_invaders;
    private Tower[] m_towers;
    
    public Level (Invader[] invaders, Tower[] towers)
    {
        m_invaders = invaders;
        m_towers = towers;
    }
    
    //returns true if the player wins
    public boolean play()
    {
        System.out.println("*******The game has started*******");
        
        //runs until all invaders are neutralized or any invader manages
        //to reach to path end.
        int activeInvaders = m_invaders.length;
        //game loop
        while (activeInvaders > 0)
        {
            //give the towers chance to shoot at the invaders at first
            //m_tower.fireOnInvaders(m_invader);
            for(int i = 0; i < m_towers.length; i++)
            {
                m_towers[i].fireOnInvaders(m_invaders);
            }
        
            //then move the active invaders
            activeInvaders = 0;
            for(int i = 0; i < m_invaders.length; i++)
            {
                if(m_invaders[i].isActive())
                {
                    activeInvaders++;
                    m_invaders[i].move();
                    
                    if (m_invaders[i].hasScored())
                    {
                        System.out.println("An invader has reached to path end");
                        return false;
                    }
                }
            }
            
        }
        
        return true;//all the invaders have been neutralized (Player won)
        
        
        
    }
}
