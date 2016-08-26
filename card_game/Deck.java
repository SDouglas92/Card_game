package card_game;

import java.util.*;

public class Deck{

  public ArrayList<Card> cards;

  public Deck(){
    this.cards = new ArrayList<Card>();
  }

  public int getDeckSize(){
    return cards.size();
  }

  public ArrayList<Card> getDeck(){
    return this.cards;
  }

  public void createDeck(){
    for(ValueType val : ValueType.values()){
      for(SuitType suit : SuitType.values()){
          Card card = new Card(val, suit);
          cards.add(card);
      }
    }
    Collections.shuffle(cards);
  }



}