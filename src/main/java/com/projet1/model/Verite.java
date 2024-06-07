package com.projet1.model;

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