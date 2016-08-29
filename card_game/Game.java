package card_game;
import java.util.*;


public class Game {

  private int currentPlayerIndex;
  private ArrayList<Player> players;
  private Dealer dealer;
  private GameLogic gameLogic;

  public Game(Dealer dealer, ArrayList<Player> players, GameLogic gameLogic){
    this.currentPlayerIndex = 0;
    this.players = players;
    this.dealer = dealer;
    this.gameLogic = gameLogic;
    Scanner scanner = new Scanner(System.in);
  }

  public int getCurrentIndex(){
    return currentPlayerIndex;
  }

  public void changeCurrentPlayer(){
    currentPlayerIndex = ((currentPlayerIndex + 1) % players.size());
  }

  public void initialDeal(){
    for(int i=0; i<(players.size() * 2); i++){
      dealer.deal(getCurrentIndex());
      changeCurrentPlayer();
    }
  }

  public void playerTurn(){
    Player currentPlayer = players.get(getCurrentIndex());
      Sytsem.out.println(currentPlayer.getHandTotal());

      while (currentPlayer.checkBust() != true){
        System.out.println("Stick or Twist?");
          String userInput = scanner.next();
        if(userInput == "Twist"){
          dealer.deal(getCurrentIndex());
        else 
          continue;
        
        }
      }
      gameLogic.checkNotBust(getCurrentIndex());
      System.out.println(currentPlayer.getHandTotal());
    }
      changeCurrentPlayer();
  }
}

// Contains game logic and method to start game and run through turns 

// initialises classes 
// creates deck 
// passes deck to dealer 
// has initial deal deal, assigns all players 2 cards
// turn based system, checks if player has reach 21, allows play to draw(deal) of stick(skip) turn checks after each draw if hand has exceed 21.
// once all players have played compares values of every players hand , highest card wins - can be draw between two players


// optional -
// can possibly look into using if statement to assign extra value to jack, queen, king to help decide draws
// look into making ace 11 unless hand value exceeds 21 in which case it becomes a 1.

// create a dealer hand for players to play against
