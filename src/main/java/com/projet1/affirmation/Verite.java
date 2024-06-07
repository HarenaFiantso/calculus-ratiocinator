package com.projet1.affirmation;

import com.projet1.Affirmation;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Verite extends Affirmation {
  private String description;

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public Boolean getValeur() {
    return true;
  }
}
