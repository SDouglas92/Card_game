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
    for (int i = 1; i < 14; i++){
      Card card = new Card(i, SuitType.DIAMONDS);
      cards.add(card);
    }

    for (int i = 1; i < 14; i++){
      Card card = new Card(i, SuitType.HEARTS);
      cards.add(card);
    }

    for (int i = 1; i < 14; i++){
      Card card = new Card(i, SuitType.SPADES);
      cards.add(card);
    }

    for (int i = 1; i < 14; i++){
      Card card = new Card(i, SuitType.CLUBS);
      cards.add(card);
    }
  }

}