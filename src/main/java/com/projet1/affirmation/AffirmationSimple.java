package com.projet1.affirmation;

import com.projet1.Affirmation;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AffirmationSimple extends Affirmation {
  private String description;
  private Boolean valeur;

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public Boolean getValeur() {
    return valeur;
  }
}
