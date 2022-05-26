import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hippo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hippo extends Actor
{
    GreenfootSound hippoSound = new GreenfootSound("casinobling.mp3.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Act - do whatever the Hippo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Hippo()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
           idleRight[i] = new GreenfootImage("images/idle/idle" + i + ".png.png");
        }
        
        for(int i = 0; i < idleLeft.length; i ++)
        {
           idleLeft[i] = new GreenfootImage("images/idle/idle" + i + ".png.png");
           idleLeft[i].mirrorHorizontally();
        }   
        
        animationTimer.mark();
        
        setImage(idleRight[0]);
    }
    
    int imageIndex = 0;
    public void animateHippo()
    {
        if(animationTimer.millisElapsed() < 200)
        { 
            return;
        }
        animationTimer.mark();    
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        
        } 
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
            
        
        }
        }
        
    
   
    public void act() 
    {
        if (Greenfoot.isKeyDown("a")){
            move(-3);
            facing = "left";
            // Add your action code here.
        } 
        if (Greenfoot.isKeyDown("d")){
            move(3);
            facing = "right";
        }
        if (isTouching(Bomb.class)){
            hippoSound.play();
            removeTouching(Bomb.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnBomb();
        }
        
        animateHippo();
    }
}
