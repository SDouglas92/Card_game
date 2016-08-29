package card_game;

import java.util.*;

public class Dealer {

    private ArrayList<Card> deck;
    private ArrayList<Player> players;

    public Dealer(ArrayList<Player> players, ArrayList<Card> deck){
      this.deck = deck;
      this.players = players;
    }

    public void deal(int playerIndex){
      Card card = deck.remove(0);
      Player currentPlayer = players.get(playerIndex);
        currentPlayer.assignCard(card);
        currentPlayer.handTotal();
    }
}