package com.projet1.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Mensonge extends Affirmation {
  private String description;

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public boolean getValeur() {
    return false;
  }
}
