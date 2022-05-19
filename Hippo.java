import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hippo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hippo extends Actor
{
    //GreenfootSound hippoSound = new GreenfootSound("casinobling.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    /**
     * Act - do whatever the Hippo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Hippo()
    {
        for(int i = 0; i < idle.length; i++)
        {
           idle[i] = new GreenfootImage("images/idle/idle" + i + ".png");
        }
            
        setImage(idle[0]);
    }
    
    int imageIndex = 0;
    public void animateHippo()
    {
        setImage(idle[imageIndex]);
        imageIndex = imageIndex + 1 % idle.length;
    }
    
        
    
   
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
            //hippoSound.play();
            removeTouching(Bomb.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnBomb();
        }
        
        animateHippo();
    }
}
