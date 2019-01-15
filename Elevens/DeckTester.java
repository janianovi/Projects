/**
 * This is a class that tests the Deck class.
 */
public class DeckTester 
{

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		
	    String[] suitOne = {"5", "Queen", "8"};
	    String[] rankOne = {"Diamonds", "Spades", "Hearts"};
	    int[] valueOne = {5, 12, 8};
	    
	    Deck firstDeck = new Deck(suitOne, rankOne, valueOne);
	    System.out.println("Deck: " + firstDeck + firstDeck.deal());
	    System.out.println("Deck size should have 3 cards: " + firstDeck.size());
	    System.out.println("Is the deck empty?: " + firstDeck.isEmpty());
	    System.out.println(" ");
	    
	    String[] suitTwo = {};
	    String[] rankTwo = {};
	    int[] valueTwo = {};
	    
	    Deck secondDeck = new Deck(suitTwo, rankTwo, valueTwo);

	    System.out.println("Deck: " + secondDeck + secondDeck.deal());
	    System.out.println("Deck size should have 0 cards: " + secondDeck.size());
	    System.out.println("Is the deck empty?: " + secondDeck.isEmpty());
	    System.out.println(" ");
	    
	    
	    String[] suitThree = {"King", "Queen", "Jack"};
	    String[] rankThree = {"Diamonds", "Spades", "Hearts"};
	    int[] valueThree = {13, 12, 11};
	    
	    Deck thirdDeck = new Deck(suitThree, rankThree, valueThree);
	    System.out.println("Deck: " + thirdDeck + thirdDeck.deal());
	    System.out.println("Deck size should have 3 cards: " + thirdDeck.size());
	    System.out.println("Is the deck empty?: " + thirdDeck.isEmpty());
	    System.out.println(" ");
	    
	}
}
