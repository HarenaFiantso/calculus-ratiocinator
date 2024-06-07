package affirmation;

import static org.junit.jupiter.api.Assertions.*;

import com.projet1.affirmation.AffirmationSimple;
import org.junit.jupiter.api.Test;

class AffirmationSimpleTest {

  @Test
  void lou_est_genereux() {
    AffirmationSimple affirmationVraie = new AffirmationSimple("Lou est généreux", true);
    assertEquals("vrai", affirmationVraie.getValeur());

    AffirmationSimple affirmationFausse = new AffirmationSimple("Lou est généreux", false);
    assertEquals("faux", affirmationFausse.getValeur());

    AffirmationSimple affirmationNull = new AffirmationSimple("Lou est généreux", null);
    assertEquals("jenesaispas", affirmationNull.getValeur());
  }
}
