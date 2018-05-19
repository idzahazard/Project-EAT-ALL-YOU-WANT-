import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends objek
{
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       moveBird(); 
       objectDisappear();
    }    
    public void objectDisappear() 
    {
        if (canSee(Burger.class)) //bila melihat kelas objek burger
       {
           eat(Burger.class); //eat kelas objek banana
           ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(10); // kelas counter ditambah sebanyak 10 poin
       }
       if (canSee(Busuk.class)) 
         {
             Greenfoot.stop();
             gameover gover = new gameover();
             getWorld().addObject(gover, getWorld().getWidth()/2, getWorld().getHeight()/2); 
         }
       
    }
    public void moveBird() //method moveMonkey
    {
          if (Greenfoot.isKeyDown("left")) //bila arah panah ke kiri ditekan
        {
            move(-7); //bergerak ke -7
        }
        if (Greenfoot.isKeyDown("right")) //bila arah panah ke kanan ditekan
        {
           move(7); //bergerak ke 7
        }
    }
}
