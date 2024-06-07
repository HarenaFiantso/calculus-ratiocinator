import com.projet1.affirmation.Verite;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class VeriteTest {

  @Test
  public void lou_est_beau() {
    Verite verite = new Verite("Lou est beau");
    assertTrue(verite.getValeur());
  }
}
