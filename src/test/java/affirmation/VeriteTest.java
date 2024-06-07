package affirmation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.projet1.affirmation.Verite;
import org.junit.jupiter.api.Test;

class VeriteTest {

  @Test
  void lou_est_beau() {
    Verite verite = new Verite("Lou est beau");
    assertEquals("vrai", verite.getValeur());
  }
}
