package card_game;
import java.util.*;

public class Player{

  private ArrayList<Card> playerHand;
  private Boolean current;

  public Player(){
    this.playerHand = new ArrayList<Card>();
    this.current = false;
  }

  public Boolean current(){
    return this.current;
  }

  // setter method for current
  public void setCurrent(Boolean truse){
    this.current = truse;
  }

  public void assignCard(Card card){
    this.playerHand.add(card);
  }

  public int handSize(){
    return playerHand.size();
  }
}