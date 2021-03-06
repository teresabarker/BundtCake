package edu.psu.ist;

import java.util.ArrayList;

public class DevilFood extends Cake {

    private ArrayList<String> additionalIngredients = new ArrayList<>();

    public DevilFood(){
        ArrayList<String> baseIngredients = super.getBaseIngredients();
        additionalIngredients.addAll(baseIngredients);
        additionalIngredients.add("cocoa");
    }

    public void printIngredients(){
        for (String item : additionalIngredients){
            System.out.println(item);
        }
    }
}
