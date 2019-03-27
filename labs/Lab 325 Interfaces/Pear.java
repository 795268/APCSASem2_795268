
/**
 * Write a description of class Pear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pear implements Fruit
{
    private int calories; 
    private String color;

    public Pear(){
        calories = 102; 
        color = "green"; 
    }

    public int calories(){
        return calories; 
    }

    public String fruitColor(){
        return color; 
    }
}
