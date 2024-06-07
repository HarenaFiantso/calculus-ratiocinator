package com.projet1.conjonction;

import com.projet1.Affirmation;

public class Ou extends Conjonction {

  public Ou(Affirmation affirmation1, Affirmation affirmation2) {
    super(affirmation1, affirmation2);
  }

  @Override
  public String getDescription() {
    return affirmation1.getDescription() + " ou " + affirmation2.getDescription();
  }

  @Override
  public Boolean getValeur() {
    Boolean valeur1 = affirmation1.getValeur();
    Boolean valeur2 = affirmation2.getValeur();

    if (valeur1 != null && valeur2 != null) return valeur1 || valeur2;
    if (valeur1 != null && valeur1) return true;
    if (valeur2 != null && valeur2) return true;

    return null;
  }
}
