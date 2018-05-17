import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bck extends World
{

    /**
     * Constructor for objects of class bck.
     * 
     */
    public bck()
    {  
        super(700, 450, 1);
        BurgerAppear(); //method burgerAppear
        prepare(); //method prepare
        BusukAppear(); //method busukAppear
    }
    public void act()
    {
        if (getObjects(Burger.class).isEmpty()) BurgerAppear();
        if (getObjects(Busuk.class).isEmpty()) BusukAppear();
    }
    private void prepare() 
    {
        Bird bird = new Bird();
        addObject(bird, 645, 403);
        Counter counter = new Counter();
        addObject(counter, 57, 69);
        Score score = new Score();
        addObject(score, 64, 44);
        score.setLocation(60, 44);
        bird.setLocation(373, 403);
    }
    public void BurgerAppear()
    {
        if(Greenfoot.getRandomNumber(2) < 50) 
        {  
            addObject(new Burger(), Greenfoot.getRandomNumber(519),20);  
            
        } 
    }
    public void  BusukAppear()
    {
         if(Greenfoot.getRandomNumber(2) < 50) 
        {  
            addObject(new Busuk(), Greenfoot.getRandomNumber(519),21);   
        } 
    }
}
        

