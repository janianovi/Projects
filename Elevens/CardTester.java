/**
 * This is a class that tests the Card class.
 * Janis Chen
 */
public class CardTester 
{

    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) 
    {
        Card card1 = new Card("Diamond", "5", 7);
        Card card2 = new Card("Diamond", "5", 7);
        Card card3 = new Card("Heart", "Queen", 12);
        
        System.out.println("Card 1");
        System.out.println("Suit: " + card1.suit());
        System.out.println("Rank: " + card1.rank());
        System.out.println("Point Value: " + card1.pointValue());
        System.out.println(card1.toString());
        System.out.println(" ");
        
        System.out.println("Card 2");
        System.out.println("Suit: " + card2.suit());
        System.out.println("Rank: " + card2.rank());
        System.out.println("Point Value: " + card2.pointValue());
        System.out.println(card2.toString());
        System.out.println(" ");
        
        System.out.println("Card 3");
        System.out.println("Suit: " + card3.suit());
        System.out.println("Rank: " + card3.rank());
        System.out.println("Point Value: " + card3.pointValue());
        System.out.println(card3.toString());
        System.out.println(" ");
        

        System.out.println("Do Card 1 and Card 2 match?: " + card2.matches(card1));
        System.out.println("Do Card 2 and Card 3 match?: " + card2.matches(card3));
        System.out.println("Do Card 1 and Card 3 match?: " + card1.matches(card3));


        
    }
}
