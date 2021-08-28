package odprac1;

// interesting idea for job interview, take a class with prefix display and use it as an entry point!!!
// also , in real life display is the entry point
public class DisplayDeck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                Card card = deck.getCard(suit, rank);
                String pr = String.format("[suit = %d card = %d]. %s of %s\n",card.getSuit(),card.getRank(),Card.rankToString(card.getRank()),
                        Card.suitToString(card.getSuit()));
                System.out.println(pr);
            }
        }
    }
}
