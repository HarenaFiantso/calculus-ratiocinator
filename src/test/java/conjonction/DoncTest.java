package conjonction;

import static org.junit.jupiter.api.Assertions.*;

import com.projet1.Affirmation;
import com.projet1.affirmation.AffirmationSimple;
import com.projet1.affirmation.Mensonge;
import com.projet1.affirmation.Verite;
import com.projet1.conjonction.Donc;
import org.junit.jupiter.api.Test;

class DoncTest {

  @Test
  void test_get_valeur() {
    Affirmation verite = new Verite("Lou est beau");
    Affirmation mensonge = new Mensonge("Lou est pauvre");
    Affirmation affirmation = new AffirmationSimple("Lou est généreux", null);

    Donc donc1 = new Donc(verite, mensonge);
    assertEquals("faux", donc1.getValeur());

    Donc donc2 = new Donc(mensonge, verite);
    assertEquals("vrai", donc2.getValeur());

    Donc donc3 = new Donc(verite, affirmation);
    assertEquals("jenesaispas", donc3.getValeur());

    Donc donc4 = new Donc(mensonge, affirmation);
    assertEquals("vrai", donc4.getValeur());
  }

  @Test
  void test_get_description() {
    Affirmation verite = new Verite("Lou est beau");
    Affirmation mensonge = new Mensonge("Lou est pauvre");

    Donc donc = new Donc(verite, mensonge);
    assertEquals("Lou est beau donc Lou est pauvre", donc.getDescription());
  }
}
