package com.projet1;

import com.projet1.affirmation.AffirmationSimple;
import com.projet1.affirmation.Mensonge;
import com.projet1.affirmation.Verite;
import com.projet1.conjonction.Donc;
import com.projet1.conjonction.Et;
import com.projet1.conjonction.Ou;

public class Main {
  public static void main(String[] args) {
    Verite verite1 = new Verite("Lou est beau");
    Mensonge mensonge1 = new Mensonge("Lou est pauvre");
    AffirmationSimple affirmation1 = new AffirmationSimple("Lou est généreux", null);

    /* Lou est pauvre et Lou est généreux: Doit retouner "faux" */
    Et exemple1 = new Et(mensonge1, affirmation1);
    System.out.println(exemple1.getDescription() + " : " + exemple1.getValeur());

    /* Lou est beau. Donc Lou est pauvre: Doit retourner "faux" */
    Donc exemple2 = new Donc(verite1, mensonge1);
    System.out.println(exemple2.getDescription() + " : " + exemple2.getValeur());

    /* Lou est pauvre. Donc Lou est généreux: Doit retourner "jenesaispas" */
    Donc exemple3 = new Donc(verite1, affirmation1);
    System.out.println(exemple3.getDescription() + " : " + exemple3.getValeur());

    /* Lou est beau ou Lou est généreux. Donc Lou est pauvre: Doit retourner "faux" */
    Ou ouAffirmation = new Ou(verite1, affirmation1);
    Donc exemple4 = new Donc(ouAffirmation, mensonge1);
    System.out.println(exemple4.getDescription() + " : " + exemple4.getValeur());

    /* 1er : Lou est beau ou Lou est généreux. Donc Lou est pauvre */
    /* 2e : Lou est pauvre ou Lou est généreux: Doit retourner "faux" */
    Ou exemple5b = new Ou(mensonge1, affirmation1);
    Et exemple5 = new Et(exemple4, exemple5b);
    System.out.println(exemple5.getDescription() + " : " + exemple5.getValeur());
  }
}
