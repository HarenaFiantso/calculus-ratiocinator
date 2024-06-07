package com.projet1.affirmation;

import com.projet1.Affirmation;

public class AffirmationSimple extends Affirmation {
  private String description;
  private boolean valeur;

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public Boolean getValeur() {
    return valeur;
  }
}
