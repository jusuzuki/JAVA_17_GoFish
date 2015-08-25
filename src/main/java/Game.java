import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

// import java.util.Comparator;

public class Game {

  public Deck myDeck;
  public ArrayList<Card> playHand = new ArrayList<Card>();
  public ArrayList<Card> compHand = new ArrayList<Card>();

  public void initializeGame() {
    myDeck = new Deck();
    myDeck.shuffle();
    playHand = myDeck.deal(7);
    compHand = myDeck.deal(7);
  }

  public void transfer(ArrayList<Card> giverHand, ArrayList<Card> receiverHand, String cardValue){
    ArrayList<Card> toRemove = new ArrayList<Card>();

    for (Card card :giverHand) {
      if (card.getValue() == cardValue) {
          receiverHand.add(card);
          toRemove.add(card);
      }
    }
    giverHand.removeAll(toRemove);
  }

  public static boolean hasCard(ArrayList<Card> name, String cardValue) {
    HashMap<String, Integer> handMap = Deck.cardMap(name);
    return handMap.containsKey(cardValue);
  }

  public String randomValue(){
    int handSize = compHand.size();
    Random myRandomGenerator = new Random();
    int cardNumber = myRandomGenerator.nextInt(handSize);
    String value = compHand.get(cardNumber).getValue();
    return value;
  }

  public void goFish(ArrayList<Card> name){

    name.add(myDeck.dealOne());
  }

}
