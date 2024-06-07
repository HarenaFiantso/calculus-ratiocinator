package com.projet1.affirmation;

public final class Verite extends Affirmation {
  public Verite(String description) {
    super(description);
  }

  @Override
  public String getValeur() {
    return "vrai";
  }
}
