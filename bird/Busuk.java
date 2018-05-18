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
    public void act() 
    {
        setLocation(getX(), getY()+5); 
        Busuk(); // Add your action code here.
    }
     public void Busuk() //method Busuk
    {
        if (canSee(Bird.class)) //bila melihat kelas bird
        {
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(-1); //kelas Count dikurangi sebanyak 1 poi
             Greenfoot.playSound("boom.wav"); //Mainkan sound boom.wav
        }
         if (atWorldEdge())  //bila objek berada di bawah world
        {
            getWorld().removeObject(this); //remove object
        }  
    }
}

