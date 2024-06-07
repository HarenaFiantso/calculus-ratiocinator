package com.projet1.conjonction;

import com.projet1.Affirmation;

public class Ou extends Conjonction {

  public Ou(Affirmation a1, Affirmation a2) {
    super(a1, a2);
  }

  @Override
  public String getDescription() {
    return affirmation1.getDescription() + " ou " + affirmation2.getDescription();
  }

  @Override
  public String getValeur() {
    String valeur1 = affirmation1.getValeur();
    String valeur2 = affirmation2.getValeur();

    if ("vrai".equals(valeur1) || "vrai".equals(valeur2)) {
      return "vrai";
    } else if ("faux".equals(valeur1) && "faux".equals(valeur2)) {
      return "faux";
    } else {
      return "jenesaispas";
    }
  }
}
