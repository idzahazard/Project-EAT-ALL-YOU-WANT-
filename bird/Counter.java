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
     private int totalCount = 0; // Counter default awal = 0
    public void act() //method act
    {
       gameOver();  //method gameOver
    }    
    public Counter() //kelas Counter
    {
         setImage(new GreenfootImage("0", 45, Color.RED, Color.BLACK)); //membuat tampilan counter dengan ukuran awal 30, tulisan warna putih, backgroun hitam
    }
    public void Counting (int hitung) // method Counting
    {
         totalCount += hitung;
         setImage(new GreenfootImage("" + totalCount, 45, Color.RED, Color.BLACK)); //membuat tampilan perubahan counter dengan ukuran awal 30, tulisan warna putih, backgroun hitam
      
    }
    public void gameOver() //method gameOver
    {
          if (totalCount >= 999999999) //bila totalCount >= 999999999
        {
            Greenfoot.stop();  // stop permainan
            Greenfoot.playSound("bananafall.wav"); //Greenfoot.playSound("bananafall.wav"); // mainkan sound bananafall.wav
            System.out.println("CONGRATULATION! YOU WON! Click RESET to play again"); //tampilkan tulisan ini
        } 
    }
}
