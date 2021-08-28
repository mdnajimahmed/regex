package odprac1;

public class Deck {
    public static final int numSuits = 4;
    public static final int numRanks = 13;
    private Card[][] cards;

    public Deck() {
        this.cards = new Card[numSuits][numRanks];
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                cards[suit - 1][rank - 1] = new Card(suit, rank);
            }
        }
    }

    public Card getCard(int suit, int rank) {
        return cards[suit - 1][rank - 1];
    }
}
