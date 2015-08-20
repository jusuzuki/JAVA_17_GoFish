import java.util.ArrayList;
import java.util.HashMap;
// import java.util.Comparator;

public class Game {

  public Deck myDeck;
  public ArrayList<Card> playHand = new ArrayList<Card>();
  public ArrayList<Card> compHand = new ArrayList<Card>();

  public void initializeGame() {
    myDeck = new Deck();
    // myDeck.shuffle();
    playHand = myDeck.deal(7);
    compHand = myDeck.deal(7);
  }

  public boolean compHasCard(String cardValue) {
    // ask for card with value
    HashMap<String, Integer> compMap = Deck.cardMap(compHand);
    return compMap.containsKey(cardValue);
  }

    // if player has card with the value
        // player receives the card(s)
        // the other player loses the card(s)
    // if not, GO FISH message: player gets a card from the master deck
        // master deck loses that card

    // if player has 4 cards with the same value, player score +1
        // the cards disappear from player's hand


}
