package com.projet1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Affirmation {
  protected String affirmation;

  public abstract String getDescription();

  public abstract String getValeur();
}
