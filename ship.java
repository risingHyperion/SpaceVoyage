import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ship extends Actor
{
    private int score = 0;
    
    
    
    public void act()
    {
        move(4);
        if (Greenfoot.isKeyDown("Right"))
        {setRotation(0);
            move(1);
        }
        if (Greenfoot.isKeyDown("Down"))
        {setRotation(90);
            move(1);
        }
        if (Greenfoot.isKeyDown("Left"))
        {setRotation(180);
            move(1);
        }
        if (Greenfoot.isKeyDown("Up"))
        {setRotation(270);
            move(1);
        }
        getCrystal();
        hitMeteor();
    }
    
    public void getCrystal()
    {
       if (isTouching(crystal.class)) {
        removeTouching(crystal.class);
        score = score +100;
        getWorld().showText("Scoare: " + score, 100, 30);
       }
    }
    
    public void hitMeteor() {
        if(isTouching(meteor.class)) {
            getWorld().showText("Ai pierdut!", 600, 400);
            Greenfoot.stop();
            removeTouching(ship.class);
        }
    }
}
    
    
    
      
