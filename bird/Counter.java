import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     private int totalCount = 0;
    public void act() 
    {
       gameOver(); 
    }    
    public Counter() //kelas Counter
    {
        setImage(new GreenfootImage("0", 30, Color.BLUE, Color.BLACK)); //membuat tampilan counter dengan ukuran awal 30, tulisan warna putih, backgroun hitam
    }
    public void Counting (int hitung) // method Counting
    {
        totalCount += hitung; 
        setImage(new GreenfootImage("" + totalCount, 30, Color.BLUE, Color.BLACK)); //membuat tampilan perubahan counter dengan ukuran awal 30, tulisan warna putih, backgroun hitam
      
    }
    public void gameOver() //method gameOver
    {
          if (totalCount >= 50) //bila totalCount >= 50
        {
            Greenfoot.stop();  // stop permainan
            //Greenfoot.playSound("tada.wav"); //mainkan sound tada.wav
            System.out.println("CONGRATULATION! YOU WON! Click RESET to play again"); //tampilkan tulisan ini
        } 
    }
}
