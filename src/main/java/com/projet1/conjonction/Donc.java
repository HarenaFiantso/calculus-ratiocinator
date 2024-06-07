package com.projet1.conjonction;

import com.projet1.Affirmation;

public class Donc extends Conjonction {

  public Donc(Affirmation affirmation1, Affirmation affirmation2) {
    super(affirmation1, affirmation2);
  }

  @Override
  public String getDescription() {
    return affirmation1.getDescription() + " donc " + affirmation2.getDescription();
  }

  @Override
  public String getValeur() {
    String v1 = affirmation1.getValeur();
    String v2 = affirmation2.getValeur();

    if ("vrai".equals(v1) && "faux".equals(v2)) {
      return "faux";
    } else if ("faux".equals(v1) || "vrai".equals(v2)) {
      return "vrai";
    } else {
      return "jenesaispas";
    }
  }
}
