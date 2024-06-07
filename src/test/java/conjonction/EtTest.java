package conjonction;

import static org.junit.jupiter.api.Assertions.*;

import com.projet1.Affirmation;
import com.projet1.affirmation.AffirmationSimple;
import com.projet1.affirmation.Mensonge;
import com.projet1.affirmation.Verite;
import com.projet1.conjonction.Et;
import org.junit.jupiter.api.Test;

class EtTest {

  @Test
  void test_de_la_premiere_aff_du_sujet() {
    Affirmation verite = new Verite("Lou est beau");
    Affirmation mensonge = new Mensonge("Lou est pauvre");
    Affirmation affirmation = new AffirmationSimple("Lou est généreux", null);

    Et et1 = new Et(verite, verite);
    assertTrue(et1.getValeur());

    Et et2 = new Et(verite, mensonge);
    assertFalse(et2.getValeur());

    Et et3 = new Et(verite, affirmation);
    assertNull(et3.getValeur());
  }

  @Test
  void test_get_description() {
    Affirmation verite = new Verite("Lou est beau");
    Affirmation mensonge = new Mensonge("Lou est pauvre");

    Et et = new Et(verite, mensonge);
    assertEquals("Lou est beau et Lou est pauvre", et.getDescription());
  }
}
