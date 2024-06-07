import static org.junit.jupiter.api.Assertions.assertTrue;

import com.projet1.affirmation.Verite;
import org.junit.jupiter.api.Test;

class VeriteTest {

  @Test
  public void lou_est_beau() {
    Verite verite = new Verite("Lou est beau");
    assertTrue(verite.getValeur());
  }
}
