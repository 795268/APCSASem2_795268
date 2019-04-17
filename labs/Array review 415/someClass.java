
/**
 * Write a description of class someClass here.
 *
 * @author (Elena Campell)
 * @version (415)
 */
import java.util.*; 
public class someClass
{
    ArrayList<String> names = new ArrayList<String>(); 
    public void sortStrings(ArrayList<String> names){
        //sortStrings sorts the contents on names into ascending order

        for(int i = 0; i < names.size() - 1; i++) {
            // value at which to start the sort
            int start = i;
            // runs through the array beginning just after the start
            for(int j = i + 1; j < names.size(); j++) {
                // compares the start value to the ones after it
                if(names.get(j).length() > names.get(start).length()){
                    start = j;
                }
            }
            // swapping part
            String temp = names.get(start);
            names.set(start, names.get(i));
            names.set(i, temp); 
        }
    }

    public void shuffleStrings(ArrayList<String> names){
        //shuffleStrings() should shuffle the contents of names
        for(int i= names.size(); i>= 0; i--){
            int random = (int)(Math.random()*i); 
            String temp = names.get(i);
            names.set(i, names.get(random));  
            names.set(random, temp);

        }
    }

    public void insertString(String word){
        //this method will insert the parameter "word" into the sorted array
        // at the location where the arrayList remains sorted.
        names.add(word);
        sortStrings(names); 

    }
}
