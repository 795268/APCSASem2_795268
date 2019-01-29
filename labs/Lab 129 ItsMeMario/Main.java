
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(){
     Character mario = new Mario("It's me Mario", 100);   
     mario.setSpeed(100); 
     System.out.println(mario.getSpeed()); 
     System.out.println(mario.getCatchphrase());
    }
}
