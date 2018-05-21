import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class objek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//Konstruktor Objek pada World Actor
public class objek extends Actor
{
    public boolean atWorldEdge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth() - 10)
         return true;
         if(getY() < 10 || getY() > getWorld().getHeight() - 10)
         return true;
         else
         return false;
    }
    /**
     * Act - do whatever the objek wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }

    
    /**
     * Method untuk memakan objek dari kelas 'clss'. Method 'eat' akan dilakukan bila
     * objek yang dimaksud ada. Selain objek tersebut, method tidak dilakukan
     */
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
            Greenfoot.playSound("eat.mp3"); // mainkan sound eat.mp3
        }
    }  
}
