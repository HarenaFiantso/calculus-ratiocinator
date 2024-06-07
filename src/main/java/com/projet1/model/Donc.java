package com.projet1.model;

public class Donc extends Conjonction {

  public Donc(Affirmation affirmation1, Affirmation affirmation2) {
    super(affirmation1, affirmation2);
  }

  @Override
  public String getDescription() {
    return affirmation1.getDescription() + " donc " + affirmation2.getDescription();
  }

  @Override
  public Boolean getValeur() {
    Boolean valeur1 = affirmation1.getValeur();
    Boolean valeur2 = affirmation2.getValeur();

    if (valeur1 == null || valeur2 == null) return null;
    if (valeur1 && !valeur2) return false;

    return true;
  }
}
