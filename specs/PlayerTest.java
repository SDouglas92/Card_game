import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;
import java.util.*;

public class PlayerTest {

  Player player;

  @Before 
  public void before(){
    player = new Player();
  }

  @Test
  public void playerHandEmpty(){
    assertEquals(0, player.handSize());
  }

  @Test
  public void playerCanBust(){
    player.setBust();
    assertEquals(true, player.checkBust());
  }
  
  

}