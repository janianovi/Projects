/**
 * Card.java
 *
 *Janis Chen
 * <code>Card</code> represents a playing card.
 */
public class Card {

    /**
     * String value that holds the suit of the card
     */
    private String suit;

    /**
     * String value that holds the rank of the card
     */
    private String rank;

    /**
     * int value that holds the point value.
     */
    private int pointValue;

    
    public Card(String cardSuit, String cardRank, int cardPointValue) 
    {
        //initializes a new Card with the given rank, suit, and point value
        
        suit = cardSuit;
        rank = cardRank;
        pointValue = cardPointValue;
    }

   
    public String suit() 
    {
        return suit;
    }

    
    public String rank() 
    {
        return rank;
    }

    
    public int pointValue() 
    {
        return pointValue;
    }

    
    public boolean matches(Card otherCard) 
    {
        return otherCard.suit().equals(suit()) && otherCard.rank().equals(rank()) && otherCard.pointValue() == pointValue();
    }

    
    @Override
    public String toString() 
    {

        return rank + " of " + suit + " (point value = " + pointValue + ")";
    }
}
