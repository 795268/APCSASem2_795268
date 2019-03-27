
/**
 * Write a description of class Orange here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Orange implements Fruit
{
    private int calories; 
    private String color;

    public Orange(){
        calories = 45; 
        color = "orange"; 
    }

    public int calories(){
        return calories; 
    }

    public String fruitColor(){
        return color; 
    }
}

