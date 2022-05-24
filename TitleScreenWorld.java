import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreenWorld here.
 * 
 * @author Isabella 
 * @version May 2022
 */
public class TitleScreenWorld extends World
{
    Label titleLabel = new Label("Hungry Doraemon", 60);
    /**
     * Constructor for objects of class TitleScreenWorld.
     * 
     */
    public TitleScreenWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, getHeight()/2);

        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hippo hippo = new Hippo();
        addObject(hippo,508,100);
        hippo.setLocation(509,98);
        hippo.setLocation(119,88);
        hippo.setLocation(314,133);
        hippo.setLocation(291,299);
        hippo.setLocation(288,177);
        Bomb bomb = new Bomb();
        addObject(bomb,378,94);
        hippo.setLocation(219,107);
        bomb.setLocation(363,109);
        bomb.setLocation(381,115);
        bomb.setLocation(353,116);
        Label label = new Label("Press [space] to Start!", 35);
        addObject(label,294,271);
        label.setLocation(342,257);
        label.setLocation(356,266);
        label.setLocation(234,266);
        label.setLocation(376,261);
    }
}
