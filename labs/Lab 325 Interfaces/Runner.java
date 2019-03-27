
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*; 
public class Runner
{
    public static void main(){

        Fruit o = new Orange(); 
        Fruit b = new Banana();
        Fruit p = new Pear();

        ArrayList <Fruit> fruits = new ArrayList<Fruit>(); 

        fruits.add(o);
        fruits.add(b); 
        fruits.add(p); 

    }

    public static void caloriesort(ArrayList<Fruit> fruits){
        //sort by number of calories with selection sort

        for(int i = 0; i < fruits.size() - 1; i++) {
            // value at which to start the sort
            int start = i;
            // runs through the array beginning just after the start
            for(int j = i + 1; j < fruits.size(); j++) {
                // compares the start value to the ones after it
                if(fruits.get(j).calories() > fruits.get(start).calories()){
                    start = j;
                }
            }
            // swapping part
            Fruit temp = fruits.get(start);
            fruits.set(start, fruits.get(i));
            fruits.set(i, temp);  
        }
    }
}
    
    