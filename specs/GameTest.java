import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;
import java.util.*;

public class GameTest {

  Player player1;
  Player player2;
  ArrayList<Player> players;

  Deck deck;
  Dealer dealer;

  GameLogic gameLogic;

  Game game;

  @Before 
  public void before(){
    player1 = new Player();
    player2 = new Player();
    players = new ArrayList<Player>();
    players.add(player1);
    players.add(player2);

    deck = new Deck();
    deck.createDeck();

    gameLogic = new GameLogic(players);

    dealer = new Dealer(players, deck.getDeck());
    game = new Game(dealer, players, gameLogic);
  }

  @Test
  public void curentPlayerChanges(){
    game.changeCurrentPlayer();
    assertEquals(1, game.getCurrentIndex());
  }

  @Test
  public void playersGivenTwoCards(){
    game.initialDeal();
    assertEquals(2, player1.handSize());
    assertEquals(2, player2.handSize());
  }


 

}