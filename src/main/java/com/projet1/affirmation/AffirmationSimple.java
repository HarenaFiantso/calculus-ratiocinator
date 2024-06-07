package com.projet1.affirmation;

import com.projet1.Affirmation;
import lombok.AllArgsConstructor;

public class AffirmationSimple extends Affirmation {
  private Boolean valeur;

  public AffirmationSimple(String affirmation, Boolean valeur) {
    super(affirmation);
    this.valeur = valeur;
  }

  @Override
  public String getDescription() {
    return affirmation;
  }

  @Override
  public String getValeur() {
    if (valeur == null) {
      return "jenesaispas";
    }
    return valeur ? "vrai" : "faux";
  }
}
