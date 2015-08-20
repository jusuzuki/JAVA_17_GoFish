import org.junit.*;
import static org.junit.Assert.*;

public class CardTest {

  @Test
  public void card_initializesCorrectly_true() {
    Card testCard = new Card("Spades", "A");
    assertEquals(true, testCard instanceof Card);
  }

  @Test
  public void getSuit_returnsACardsSuit_Spades() {
    Card testCard = new Card("Spades", "A");
    assertEquals("Spades", testCard.getSuit());
  }

  @Test
  public void getValue_returnsACardsSuit_A() {
    Card testCard = new Card("Spades", "A");
    assertEquals("A", testCard.getValue());
  }

  @Test
  public void name_returnsAFormattedNameForCard_AOfSpades() {
    Card testCard = new Card("Spades", "A");
    assertEquals("A of Spades", testCard.name());
  }
}
