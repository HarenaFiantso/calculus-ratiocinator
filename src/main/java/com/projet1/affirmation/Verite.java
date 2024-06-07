package com.projet1.affirmation;

import com.projet1.Affirmation;

public class Verite extends Affirmation {

  public Verite(String affirmation) {
    super(affirmation);
  }

  @Override
  public String getDescription() {
    return affirmation;
  }

  @Override
  public String getValeur() {
    return "vrai";
  }
}
