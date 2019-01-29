
/**
 * Write a description of class Mario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mario extends Character
{
    public  Mario(String cp, int sp) { 
     super(cp, sp);
    }
    
    public void setSpeed(int speed){
     super.setSpeed(speed*2); 
    }
}
