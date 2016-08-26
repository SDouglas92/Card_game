package card_game;

import java.util.*;

public class Dealer {

    private ArrayList<Card> deck;
    private ArrayList<Player> players;

    public Dealer(ArrayList<Player> players, ArrayList<Card> deck){
      this.deck = deck;
      this.players = players;
    }

    public void deal(){
      Card card = deck.remove(0);
      Player currentPlayer = players.get(0);
      for(Player player : players){
        if (player.current() == true)
          currentPlayer = player; 

      }
      currentPlayer.assignCard(card);
    }
}