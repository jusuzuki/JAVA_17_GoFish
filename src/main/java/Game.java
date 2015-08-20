import java.util.ArrayList;
import java.util.HashMap;

public class Game {

  public static HashMap<String, ArrayList<Card>> handHashMap =
    new HashMap<String, ArrayList<Card>>();

  public void newGame(){

    Deck myDeck = new Deck();
    myDeck.shuffle();
    ArrayList<Card> playerHand = myDeck.deal(7);
    ArrayList<Card> computerHand = myDeck.deal(7);

    handHashMap.put("p1", playerHand);
    handHashMap.put("comp", computerHand);
  }


}
