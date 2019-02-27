/**
 * This is a class that tests the Deck class.
 */
import java.util.ArrayList; 
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank1 = { "King", "Queen", "Jack"}; 
		String[] suit1 = {"Spade", "Heart", "Diamond"};
		int [] value1 = { 13, 12,11} ; 
		Deck deck1 = new Deck ( rank1, suit1, value1); 
		System.out.println (deck1.size()); 
		
		String[] rank2 = { "5", "6", "7"}; 
		String[] suit2 = {"Spade", "Heart", "Diamond"};
		int [] value2 = {  5,6,7} ; 
		Deck deck2 = new Deck ( rank2, suit2, value2); 
		System.out.println (deck2.size()); 
		
		String[] rank3 = { "7", "8", "9"}; 
		String[] suit3 = {"Spade", "Heart", "Diamond"};
		int [] value3 = {7,8,9} ; 
		Deck deck3 = new Deck ( rank3, suit3, value3); 
		System.out.println (deck3.size()); 
		
	}
}
