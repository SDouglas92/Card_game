package card_game;
import java.util.*;

public class Player{

  private ArrayList<Card> playerHand;
  private Boolean playerBust;
  private int handTotal;
 

  public Player(){
    this.playerHand = new ArrayList<Card>();
    this.playerBust = false;
    this.handTotal = 0;
  }

  public void assignCard(Card card){
    this.playerHand.add(card);
  }

  public int handSize(){
    return playerHand.size();
  }

  public ArrayList<Card> getHand(){
    return this.playerHand;
  }

  public Boolean checkBust(){
    return this.playerBust;
  }

  public void setBust(){
    this.playerBust = true;
  }

  public void handTotal(){
    ArrayList<Card> cards = getHand();
    int total = 0;
      for (Card card : cards){
        total += card.getValue();
      }
    this.handTotal = total;
  }

  public int getHandTotal(){
    return this.handTotal;
  }
}