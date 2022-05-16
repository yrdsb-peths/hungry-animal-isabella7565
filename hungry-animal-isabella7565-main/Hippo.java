import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hippo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hippo extends Actor
{
    /**
     * Act - do whatever the Hippo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("a")){
            move(-3);
            // Add your action code here.
        } 
        if (Greenfoot.isKeyDown("d")){
            move(3);
        }
        if (isTouching(Bomb.class)){
            removeTouching(Bomb.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnBomb();
        }
    }
}
