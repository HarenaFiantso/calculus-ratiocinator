package com.projet1.conjonction;

import com.projet1.affirmation.Affirmation;

public final class Donc extends Conjonction {

  private static final String VRAI = "vrai";
  private static final String FAUX = "faux";

  public Donc(Affirmation affirmation1, Affirmation affirmation2) {
    super(affirmation1, affirmation2);
  }

  @Override
  public String getDescription() {
    return affirmation1.getDescription() + ". Donc " + affirmation2.getDescription();
  }

  @Override
  public String getValeur() {
    String valeur1 = affirmation1.getValeur();
    String valeur2 = affirmation2.getValeur();

    if (VRAI.equals(valeur1) && FAUX.equals(valeur2)) {
      return FAUX;
    } else if (FAUX.equals(valeur1) || VRAI.equals(valeur2)) {
      return VRAI;
    }
    return super.getValeur();
  }
}
