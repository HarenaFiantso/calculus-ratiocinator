package com.projet1.model;

public class AffirmationSimple extends Affirmation {
  private String description;
  private boolean valeur;

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public boolean getValeur() {
    return valeur;
  }
}
