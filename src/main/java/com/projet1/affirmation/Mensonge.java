package com.projet1.affirmation;

public final class Mensonge extends Affirmation {
  public Mensonge(String description) {
    super(description);
  }

  @Override
  public String getValeur() {
    return "faux";
  }
}
