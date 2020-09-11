
import java.util.Random;


/**
 * Game description: Invaders move along a path over a map. Towers try to
 * neutralize them. If an invader manages to reach to the end of the path,
 * the player loses. Otherwise i.e. if all the invaders are neutralized before
 * anyone of them can reach to the end of the path, the player wins.
 * @author (Ashek Ahmmed)
 * @version (7-5-2019)
 */

//Contains the main method.

public class Game
{
    public static void main (String[] args)
    {
        Map map = new Map(8,5);//means our map has width = 8 and height = 5
        
        MapLocation[] _path = new MapLocation[map.getMapWidth()];
        
        for (int i = 0; i < _path.length; i++)
        {
            _path[i] = new MapLocation(i,2,map);
        }
        
        //we create a path object.
        Path path = new Path(_path);
        
        /*
         * There can be different types of invaders as well.
         * - SheildedInvader (when it is attacked by a tower, the health decreases at a slower rate compared to a typical invader.
         * - FastInvader (travels at a faster rate along the path, compared to a typical invader.
        */
        
        //Invader invader = new Invader(path,1.0);//initial health is 1
        final int num_Invaders = 3;
        Invader[] invaders = new Invader[num_Invaders];//creating 3 invaders
        
        invaders[0] = new BetaInvader(path,2.0);//initial health is 2 and for this invader health decreases slowly
        invaders[1] = new AlphaInvader(path,3.0);//initial health is 2 and this invader moves faster
        invaders[2] = new NormalInvader(path,2.0);//initial health is 2 and this is a normal invader
        
        //next we create an array of towers, let's call the array _towers
        /* When a tower is created it should be placed on the map but it can't be on the path through which invaders are traveling i.e. it can't take out an invader head-on.
         * each tower continuously checks the following:
         * - how many active invaders are within its shooting range?
         * - and then shoots at those invaders which are within range.
         * - each shot can be either successful or unsuccessful (misses the target invader).
         * - if it is a successful shot, the target invader should sustain some damage i.e. its health should decease by some amount depending on the type of the invader (e.g. a shieldedinvader
         * should sustain less damage at each successful shot.
         * - a tower can not hit more than one invader at a time.
         */
        boolean values = true;
        final int num_Towers = 2;
        Random rand = new Random(); 
        //(max - min + 1) + min
        int max = 3;
        int min = 1;
        int x,y;
        // setting random values to x and y
        x = rand.nextInt(max - min +1)+min;  
        y = rand.nextInt(max - min +1)+min;
        
        
        Tower[] towers = new Tower[num_Towers];//creating 2 towers
         System.out.println("Alpha Tower Intial Position: ("+x+","+y+")");
         //setting random values to towers
        towers[0] = new alphaTower(new MapLocation(x,y,map), 1.0, 0.5); //range = 1, power =1 
        x = rand.nextInt(map.getMapWidth() - min +1)+min;  
        y = rand.nextInt(max - min +1)+min;
        
        towers[1] = new BetaTower(new MapLocation(x,y,map), 1.0, 0.5); //range = 1, power =1 
        System.out.println("Beta Tower Intial Position: ("+x+","+y+")");
        //next we create a game level with our defined set of invaders and towers.
        //Level level = new Level(_invaders,_towers);
                
        Level level = new Level(invaders,towers);
        boolean playerWon = level.play();
        
        if (playerWon)
        {
             System.out.println("Hurrah! you won.");
        }
        else
        {
             System.out.println("You lost, Try again.");
        }
    }
}
