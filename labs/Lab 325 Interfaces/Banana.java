
/**
 * Write a description of class Banana here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Banana implements Fruit
{
    private int calories; 
    private String color;

    public Banana(){
        calories = 105; 
        color = "yellow"; 
    }

    public int calories(){
        return calories; 
    }

    public String fruitColor(){
        return color; 
    }
}
