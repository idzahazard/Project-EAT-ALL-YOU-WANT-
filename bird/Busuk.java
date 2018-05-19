import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Busuk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Busuk extends objek
{
    /**
     * Act - do whatever the Busuk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX(), getY()+5); 
        Busuk(); // Add your action code here.
    }

     public void Busuk() //method Busuk
    {
         if (atWorldEdge())  //bila objek berada di bawah world
        {
            getWorld().removeObject(this); //remove object
             Greenfoot.playSound("boom.wav");
        }  
    }
}

