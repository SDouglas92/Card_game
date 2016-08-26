import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;
import java.util.*;


public class DeckTest{

  Deck cards;

  @Before 
  public void before(){
    cards = new Deck();
  }

  @Test 
  public void deckPopulated(){
    cards.createDeck();
    assertEquals(52, cards.getDeckSize());
  }

 // @Test 
 // public void testDeck(){
 //  cards.createDeck();
 //  ArrayList<Card>all_cards = cards.getDeck();
 //  Card test_card = all_cards.get(0);
 //  assertEquals(1, test_card.getValue());
 // }
}