
/**
 * Write a description of class WordPair here.
 *
 * @Elena Campell 
 * @2018 frq wordpair 
 */

import java.util.ArrayList; 
public class WordPairList
{
    private ArrayList<WordPair> allPairs; 
    public WordPairList(String[] words)
    {
        allPairs = new ArrayList<WordPair>(); 
        for (int i = 0; i < words.length - 1; i ++){
            for (int j = i+1; j< words.length; j++){
                allPairs.add(new WordPair(words[i], words [j])); 
            }
        }
    }

    public int numMatches() { 
        int numMatches = 0 ; 
        for (int i = 0; i < allPairs.size() ; i ++){
            if (allPairs.getFirst().equals(allPairs.getSecond())){
                numMatches ++;
            }
        }
        return numMatches; 
    }
    
    public void main (){
        
    }

}
