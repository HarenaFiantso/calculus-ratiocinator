package com.projet1.affirmation;

import com.projet1.conjonction.Conjonction;
import lombok.Getter;

@Getter
public sealed class Affirmation permits Verite, Mensonge {
  private final String description;
  private final String valeur;
  private final Conjonction conjonction;

  public Affirmation(String description) {
    this.description = description;
    this.valeur = "jenesaispas";
    this.conjonction = null;
  }

  public Affirmation(Conjonction conjonction) {
    this.description = conjonction.getDescription();
    this.valeur = conjonction.getValeur();
    this.conjonction = conjonction;
  }
}
