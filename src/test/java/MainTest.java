import static org.junit.jupiter.api.Assertions.assertEquals;

import com.projet1.affirmation.Affirmation;
import com.projet1.affirmation.Mensonge;
import com.projet1.affirmation.Verite;
import com.projet1.conjonction.Donc;
import com.projet1.conjonction.Et;
import com.projet1.conjonction.Ou;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MainTest {

  private Affirmation creerAffirmation(String phrase, boolean estVerite) {
    return estVerite ? new Verite(phrase) : new Mensonge(phrase);
  }

  @Test
  void testStatutVeriteEstVrai() {
    var louEstBeau = creerAffirmation("Lou est beau", true);
    assertEquals("vrai", louEstBeau.getValeur());
  }

  @Test
  void testStatutMensongeEstFaux() {
    var louEstPauvre = creerAffirmation("Lou est pauvre", false);
    assertEquals("faux", louEstPauvre.getValeur());
  }

  @Test
  void testStatutAffirmationEstJenesaispasParDefaut() {
    var louEstGenereux = new Affirmation("Lou est généreux");
    assertEquals("jenesaispas", louEstGenereux.getValeur());
  }

  @Test
  void testLouEstPauvreEtLouEstGenereuxEstFaux() {
    var louEstPauvre = creerAffirmation("Lou est pauvre", false);
    var louEstGenereux = new Affirmation("Lou est généreux");
    var combinaison = new Et(louEstPauvre, louEstGenereux);

    var affirmation = new Affirmation(combinaison);
    assertEquals("faux", affirmation.getValeur());
  }

  @Test
  void testPhraseLouEstPauvreEtLouEstGenereuxEstCorrecte() {
    var louEstPauvre = creerAffirmation("Lou est pauvre", false);
    var louEstGenereux = new Affirmation("Lou est généreux");
    var combinaison = new Et(louEstPauvre, louEstGenereux);

    var affirmation = new Affirmation(combinaison);
    assertEquals("Lou est pauvre et Lou est généreux", affirmation.getDescription());
  }

  @Test
  void testLouEstBeauDoncLouEstPauvreEstFaux() {
    var louEstBeau = creerAffirmation("Lou est beau", true);
    var louEstPauvre = creerAffirmation("Lou est pauvre", false);
    var combinaison = new Donc(louEstBeau, louEstPauvre);

    var affirmation = new Affirmation(combinaison);
    assertEquals("faux", affirmation.getValeur());
  }

  @Test
  void testLouEstPauvreDoncLouEstGenereuxEstVrai() {
    var louEstPauvre = creerAffirmation("Lou est pauvre", false);
    var louEstGenereux = new Affirmation("Lou est généreux");
    var combinaison = new Donc(louEstPauvre, louEstGenereux);

    var affirmation = new Affirmation(combinaison);
    assertEquals("vrai", affirmation.getValeur());
  }

  @Test
  void testLouEstBeauOuLouEstGenereuxDoncLouEstPauvreEstFaux() {
    var louEstBeau = creerAffirmation("Lou est beau", true);
    var louEstGenereux = new Affirmation("Lou est généreux");
    var combinaisonOu = new Ou(louEstBeau, louEstGenereux);

    var affirmationOu = new Affirmation(combinaisonOu);
    var louEstPauvre = creerAffirmation("Lou est pauvre", false);
    var combinaisonDonc = new Donc(affirmationOu, louEstPauvre);

    var affirmation = new Affirmation(combinaisonDonc);
    assertEquals("faux", affirmation.getValeur());
  }

  @Test
  void testPhraseLouEstBeauOuLouEstGenereuxDoncLouEstPauvreEstCorrecte() {
    var louEstBeau = creerAffirmation("Lou est beau", true);
    var louEstGenereux = new Affirmation("Lou est généreux");
    var combinaisonOu = new Ou(louEstBeau, louEstGenereux);

    var affirmationOu = new Affirmation(combinaisonOu);
    var louEstPauvre = creerAffirmation("Lou est pauvre", false);
    var combinaisonDonc = new Donc(affirmationOu, louEstPauvre);

    var affirmation = new Affirmation(combinaisonDonc);
    assertEquals(
        "Lou est beau ou Lou est généreux. Donc Lou est pauvre", affirmation.getDescription());
  }

  @Test
  void testJenesaispasSiLouEstPauvreOuLouEstGenereux() {
    var louEstPauvre = creerAffirmation("Lou est pauvre", false);
    var louEstGenereux = new Affirmation("Lou est généreux");
    var combinaison = new Ou(louEstPauvre, louEstGenereux);

    var affirmation = new Affirmation(combinaison);
    assertEquals("jenesaispas", affirmation.getValeur());
  }

  @Test
  void testJenesaispasSiLouEstBeauEtLouEstGenereux() {
    var louEstBeau = creerAffirmation("Lou est beau", true);
    var louEstGenereux = new Affirmation("Lou est généreux");
    var combinaison = new Et(louEstBeau, louEstGenereux);

    var affirmation = new Affirmation(combinaison);
    assertEquals("jenesaispas", affirmation.getValeur());
  }

  @Test
  void testJenesaispasSiLouEstBeauOuLouEstPauvreDoncLouEstGenereux() {
    var louEstBeau = creerAffirmation("Lou est beau", true);
    var louEstPauvre = creerAffirmation("Lou est pauvre", false);
    var combinaisonOu = new Ou(louEstBeau, louEstPauvre);

    var affirmationOu = new Affirmation(combinaisonOu);
    var louEstGenereux = new Affirmation("Lou est généreux");
    var combinaisonDonc = new Donc(affirmationOu, louEstGenereux);

    var affirmation = new Affirmation(combinaisonDonc);
    assertEquals("jenesaispas", affirmation.getValeur());
  }

  @Test
  void testLouEstBeauEtLouEstGenereuxEstJenesaispas() {
    var louEstBeau = creerAffirmation("Lou est beau", true);
    var louEstGenereux = new Affirmation("Lou est généreux");
    var combinaison = new Et(louEstBeau, louEstGenereux);

    var affirmation = new Affirmation(combinaison);
    assertEquals("jenesaispas", affirmation.getValeur());
  }

  @Test
  void testLouEstGenereuxEtLouEstBeauEstJenesaispas() {
    var louEstGenereux = new Affirmation("Lou est généreux");
    var louEstBeau = creerAffirmation("Lou est beau", true);
    var combinaison = new Et(louEstGenereux, louEstBeau);

    var affirmation = new Affirmation(combinaison);
    assertEquals("jenesaispas", affirmation.getValeur());
  }

  @Test
  void testLouEstPauvreEtLouEstBeauEstFaux() {
    var louEstPauvre = creerAffirmation("Lou est pauvre", false);
    var louEstBeau = creerAffirmation("Lou est beau", true);
    var combinaison = new Et(louEstPauvre, louEstBeau);

    var affirmation = new Affirmation(combinaison);
    assertEquals("faux", affirmation.getValeur());
  }

  @Test
  @Disabled
  void testLouEstGenereuxEtLouEstPauvreEstFaux() {
    var louEstGenereux = new Affirmation("Lou est généreux");
    var louEstPauvre = creerAffirmation("Lou est pauvre", false);
    var combinaison = new Et(louEstGenereux, louEstPauvre);

    var affirmation = new Affirmation(combinaison);
    assertEquals("faux", affirmation.getValeur());
  }

  @Test
  void testPhraseComplexeEstCorrecte() {
    var louEstBeau = creerAffirmation("Lou est beau", true);
    var louEstGenereux = new Affirmation("Lou est généreux");
    var combinaisonEt = new Et(louEstBeau, louEstGenereux);

    var affirmationEt = new Affirmation(combinaisonEt);
    var louEstPauvre = creerAffirmation("Lou est pauvre", false);
    var combinaisonDonc = new Donc(affirmationEt, louEstPauvre);

    var affirmation = new Affirmation(combinaisonDonc);
    assertEquals(
        "Lou est beau et Lou est généreux. Donc Lou est pauvre", affirmation.getDescription());
  }

  @Test
  void testDeuxVeritesEstVrai() {
    var louEstBeau = creerAffirmation("Lou est beau", true);
    var louEstIntelligent = creerAffirmation("Lou est intelligent", true);
    var combinaison = new Et(louEstBeau, louEstIntelligent);

    var affirmation = new Affirmation(combinaison);
    assertEquals("vrai", affirmation.getValeur());
  }

  @Test
  void testDeuxMensongesEstFaux() {
    var louEstPauvre = creerAffirmation("Lou est pauvre", false);
    var louEstMenteur = creerAffirmation("Lou est menteur", false);
    var combinaison = new Et(louEstPauvre, louEstMenteur);

    var affirmation = new Affirmation(combinaison);
    assertEquals("faux", affirmation.getValeur());
  }
}
