
/**
 * Write a description of class WordPair here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordPair
{
    String [] words1; 
    public WordPair(String first, String second){ 
        words1 = new String [2]; 
    }
    public String getFirst() { //returns firts string of wordpair object
        return words1[0];
    }
    public String getSecond(){
            return words1[1]; 
    }
}
