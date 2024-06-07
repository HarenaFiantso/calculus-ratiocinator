package com.projet1.affirmation;

import com.projet1.Affirmation;

public class Mensonge extends Affirmation {

  public Mensonge(String affirmation) {
    super(affirmation);
  }

  @Override
  public String getDescription() {
    return affirmation;
  }

  @Override
  public String getValeur() {
    return "faux";
  }
}
