package odprac1;

public class Card {
    // Kinds of suits
    public static final int DIAMONDS = 1;
    public static final int CLUBS = 2;
    public static final int HEARTS = 3;
    public static final int SPADES = 4;
    // Kinds of ranks
    public final static int ACE = 1;
    public final static int DEUCE = 2;
    public final static int THREE = 3;
    public final static int FOUR = 4;
    public final static int FIVE = 5;
    public final static int SIX = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE = 9;
    public final static int TEN = 10;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;
    private int rank;
    private int suit;

    public Card(int suit, int rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public static String rankToString(int rank) {
        switch (rank) {
            case ACE:
                return "Ace";
            case DEUCE:
                return "Deuce";
            case THREE:
                return "Three";
            case FOUR:
                return "Four";
            case FIVE:
                return "Five";
            case SIX:
                return "Six";
            case SEVEN:
                return "Seven";
            case EIGHT:
                return "Eight";
            case NINE:
                return "Nine";
            case TEN:
                return "Ten";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            default:
                //Handle an illegal argument.  There are generally two
                //ways to handle invalid arguments, throwing an exception
                //(see the section on Handling Exceptions) or return null
                return null;
        }
    }

    public static String suitToString(int suit) {
        switch (suit) {
            case DIAMONDS:
                return "Diamonds";
            case CLUBS:
                return "Clubs";
            case HEARTS:
                return "Hearts";
            case SPADES:
                return "Spades";
            default:
                return null;
        }
    }

    public int getRank() {
        return this.rank;
    }

    public int getSuit() {
        return this.suit;
    }
}
