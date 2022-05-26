import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public int score = 0;;
    public Label scoreLabel = new Label(score, 80);
    int level = 1;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        Hippo h = new Hippo();
        addObject(h, 300, 350);
        
        addObject (scoreLabel, 50, 50);
        
        spawnBomb();
    }
    
    public void spawnBomb()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        
        Bomb b = new Bomb();
        b.setSpeed(level);
        addObject(b, x, y);
    }
    
    public void increaseScore()
    {
        score ++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    public void gameOver()
    {
        GameOverWorld world = new GameOverWorld();
        Greenfoot.setWorld(world);
        //Label gameOverLabel = new Label ("Game Over!", 100);
        //addObject(gameOverLabel, 300, 200);
    }
}
    

