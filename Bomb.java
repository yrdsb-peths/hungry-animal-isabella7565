import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 1;
    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        setLocation(x, y);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() > world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
        
    } 
    
    public void setSpeed(int spd)
    {
        speed = spd;
        
    }
}
