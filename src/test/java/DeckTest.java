import org.junit.*;
import static org.junit.Assert.*;

public class DeckTest {

  @Test
  public void card_initializesCorrectly_true() {
    Deck testDeck = new Deck();
    assertEquals(true, testDeck instanceof Deck);
  }

  @Test
  public void getSuit_returnsACardsSuit_Spades() {
    Deck testDeck = new Deck();
    Card myCard = testDeck.getCard(0);
    assertEquals("A of \u2660", myCard.name());
  }

  @Test
  public void deck_shufflesCorrectly_false() {
    Deck testDeck = new Deck();
    Deck shuffledDeck = new Deck();
    shuffledDeck.shuffle();
    assertEquals(false, testDeck == shuffledDeck);
  }


  // @Test
  // public void getValue_returnsACardsSuit_A() {
  //   Card testCard = new Card("Spades", "A");
  //   assertEquals("A", testCard.getValue());
  // }
  //
  // @Test
  // public void name_returnsAFormattedNameForCard_AOfSpades() {
  //   Card testCard = new Card("Spades", "A");
  //   assertEquals("A of Spades", testCard.name());
  // }
}
