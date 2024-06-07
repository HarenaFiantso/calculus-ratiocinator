package com.projet1.conjonction;

import com.projet1.affirmation.Affirmation;
import lombok.Getter;

@Getter
public abstract sealed class Conjonction permits Et, Ou, Donc {
  protected final Affirmation affirmation1;
  protected final Affirmation affirmation2;
  protected final String valeur;
  protected final String description;

  protected Conjonction(Affirmation affirmation1, Affirmation affirmation2) {
    this.affirmation1 = affirmation1;
    this.affirmation2 = affirmation2;
    this.valeur = "jenesaispas";
    this.description = "";
  }
}
