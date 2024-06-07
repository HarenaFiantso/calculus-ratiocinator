package com.projet1.conjonction;

import com.projet1.Affirmation;

public class Et extends Conjonction {

  public Et(Affirmation affirmation1, Affirmation affirmation2) {
    super(affirmation1, affirmation2);
  }

  @Override
  public String getDescription() {
    return affirmation1.getDescription() + " et " + affirmation2.getDescription();
  }

  @Override
  public String getValeur() {
    String valeur1 = affirmation1.getValeur();
    String valeur2 = affirmation2.getValeur();

    if ("vrai".equals(valeur1) && "vrai".equals(valeur2)) {
      return "vrai";
    } else if ("faux".equals(valeur1) || "faux".equals(valeur2)) {
      return "faux";
    } else {
      return "jenesaispas";
    }
  }
}
