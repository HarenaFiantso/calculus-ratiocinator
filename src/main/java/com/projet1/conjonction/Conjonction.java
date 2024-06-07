package com.projet1.conjonction;

import com.projet1.Affirmation;
import lombok.AllArgsConstructor;

public abstract class Conjonction extends Affirmation {
  protected Affirmation affirmation1;
  protected Affirmation affirmation2;


  public Conjonction(Affirmation affirmation1, Affirmation affirmation2) {
    super(null);
    this.affirmation1 = affirmation1;
    this.affirmation2 = affirmation2;
  }

  @Override
  public abstract String getValeur();

  @Override
  public abstract String getDescription();
}
