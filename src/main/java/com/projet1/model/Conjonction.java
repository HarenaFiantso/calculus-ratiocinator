package com.projet1.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Conjonction extends Affirmation {
  protected Affirmation affirmation1;
  protected Affirmation affirmation2;
}
