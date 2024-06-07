import static org.junit.jupiter.api.Assertions.*;

import com.projet1.affirmation.AffirmationSimple;
import org.junit.jupiter.api.Test;

class AffirmationSimpleTest {

  @Test
  public void lou_est_genereux() {
    AffirmationSimple affirmationVraie = new AffirmationSimple("Lou est généreux", true);
    assertTrue(affirmationVraie.getValeur());

    AffirmationSimple affirmationFausse = new AffirmationSimple("Lou est généreux", false);
    assertFalse(affirmationFausse.getValeur());

    AffirmationSimple affirmationNull = new AffirmationSimple("Lou est généreux", null);
    assertNull(affirmationNull.getValeur());
  }
}
