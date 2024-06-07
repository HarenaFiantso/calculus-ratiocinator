package com.projet1.conjonction;

import com.projet1.Affirmation;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Conjonction extends Affirmation {
  protected Affirmation affirmation1;
  protected Affirmation affirmation2;
}
