package edu.psu.ist;

import java.util.ArrayList;

public class Bundt extends Cake {

    private ArrayList<String> additionalIngredients = new ArrayList<>();

    public Bundt() {
        ArrayList<String> baseIngredients = super.getBaseIngredients();
        additionalIngredients.addAll(baseIngredients);
        additionalIngredients.add("Baking Powder");
        additionalIngredients.add("Salt");
        additionalIngredients.add("Vanilla Extract");
        additionalIngredients.add("Milk");
        additionalIngredients.add("Almond Extract (optional)");
    }

    public void printIngredients() {
        for (String item : additionalIngredients) {
            System.out.println(item);
        }
    }
}
