package card_game;

public class Card {

  ValueType value;
  SuitType suit;

  public Card(ValueType value, SuitType suit){
    this.value = value;
    this.suit = suit;
  }

  public int getValue(){
    ValueType card = this.value;
    return card.getIntValue();
  }

  public SuitType getSuit(){
    return this.suit;
  }

}