import java.util.ArrayList;
import java.util.Collections;
import java.util.StringJoiner;
import java.util.stream.Collectors;

class Deck {

  public static ArrayList<Card> deck = new ArrayList<Card>();

  private static final String[] SUITS = {
    "\u2660",  // spades
    "\u2663",  // clubs
    "\u2665",  // hearts
    "\u2666"   // diamonds
    };

  private static final String[] VALUES = {
    "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"
  };

  public Deck() {
    for (String suit : SUITS) {
      for (String value : VALUES) {
        Card newCard = new Card(suit, value);
        deck.add(newCard);
      }
    }
  }

  public static String displayDeck() {
    String commaSeparatedCards = deck.stream()
      .map(Card::name)
      .collect(Collectors.joining(", "));
    return "[" + commaSeparatedCards + "]";
  }

  public static Card getCard(int id){
    return deck.get(id);
  }

  public static void shuffle() {
    Collections.shuffle(deck);
  }

  public static ArrayList<Card> deal(int numOfCards){
    ArrayList<Card> hand = new ArrayList<Card>();
    for (int i = 0; i < numOfCards; i++){
      hand.add(deck.get(0));
      deck.remove(0);
    }
    return hand;
  }

  public static String displayHand(ArrayList<Card> hand) {
    String commaSeparatedCards = hand.stream()
      .map(Card::name)
      .collect(Collectors.joining(", "));
    return "[" + commaSeparatedCards + "]";
  }


}
