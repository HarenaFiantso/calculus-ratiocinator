import com.projet1.affirmation.Verite;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VeriteTest {

  @Test
  public void testGetValeur() {
    Verite verite = new Verite("Lou est beau");
    assertTrue(verite.getValeur());
  }

  @Test
  public void testGetDescription() {
    Verite verite = new Verite("Lou est beau");
    assertEquals("Lou est beau", verite.getDescription());
  }
}
