package card_game;

public class Card {

  int value;
  SuitType suit;

  public Card(int value, SuitType suit){
    this.value = value;
    this.suit = suit;
  }

  public int getValue(){
    return this.value;
  }

  public SuitType getSuit(){
    return this.suit;
  }

}