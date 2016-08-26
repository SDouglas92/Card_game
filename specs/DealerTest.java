import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;
import java.util.*;

public class DealerTest {

  Player player;
  ArrayList<Player> players;
  Deck deck;
  Dealer dealer;

  @Before 
  public void before(){
    player = new Player();
    players = new ArrayList<Player>();
    players.add(player);
    deck = new Deck();
    deck.createDeck();
    dealer = new Dealer(players, deck.getDeck());
  }

  @Test
  public void assignCardToPlayer(){
    player.setCurrent(true);
    dealer.deal();
    assertEquals(1, player.handSize());
  }

    
}