package conjonction;

import static org.junit.jupiter.api.Assertions.*;

import com.projet1.Affirmation;
import com.projet1.affirmation.AffirmationSimple;
import com.projet1.affirmation.Mensonge;
import com.projet1.affirmation.Verite;
import com.projet1.conjonction.Ou;
import org.junit.jupiter.api.Test;

class OuTest {

  @Test
  void test_get_valeur() {
    Affirmation verite = new Verite("Lou est beau");
    Affirmation mensonge = new Mensonge("Lou est pauvre");
    Affirmation affirmation = new AffirmationSimple("Lou est généreux", null);

    Ou ou1 = new Ou(verite, mensonge);
    assertTrue(ou1.getValeur());

    Ou ou2 = new Ou(mensonge, mensonge);
    assertFalse(ou2.getValeur());

    Ou ou3 = new Ou(mensonge, affirmation);
    assertNull(ou3.getValeur());

    Ou ou4 = new Ou(verite, affirmation);
    assertTrue(ou4.getValeur());
  }

  @Test
  void test_get_description() {
    Affirmation verite = new Verite("Lou est beau");
    Affirmation mensonge = new Mensonge("Lou est pauvre");

    Ou ou = new Ou(verite, mensonge);
    assertEquals("Lou est beau ou Lou est pauvre", ou.getDescription());
  }
}
