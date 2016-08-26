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
  public void playerNotCurrent(){
    assertEquals(false, player.current());
  }

  @Test
  public void playerIsCurrent(){
    player.setCurrent(true);
    assertEquals(true, player.current());
  }

}