import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Burger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
*/
public class Burger extends objek
{
    /**
     * Act - do whatever the Burger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0; 
    public void act() 
    {
        setLocation(getX(), getY()+6);
        Burger();     
    }    
    
    public void Burger() //method burger
    {
         if (atWorldEdge())  //bila objek berada di bawah world
        {
            getWorld().removeObject(this); //remove object
            Greenfoot.playSound("ohno.mp3"); // mainkan sound ohno.mp3
        }  
    }
}
