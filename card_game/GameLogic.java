package card_game;
import java.util.*;

public class GameLogic {

  ArrayList<Player> players;
  Player winner;

  public GameLogic(ArrayList<Player> players){
    this.players = players;
    this.winner = null;
  }

  public void checkNotBust(int currentPlayer){
    Player player = players.get(currentPlayer);
      player.handTotal();
       if(player.getHandTotal() > 21){
        player.setBust();
      }
  }

  public void compareHands(){
    for(Player player : players){
      if(player.checkBust() != true){
        if(player.getHandTotal() > winner.getHandTotal()){
          winner = player;
        } 
      }
    }
  }


}