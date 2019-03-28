package edu.psu.ist;

import java.util.ArrayList;

public class AngelFood extends Cake {

    private ArrayList<String> additionalIngredients = new ArrayList<>();

    public AngelFood(){
        ArrayList<String> baseIngredients = super.getBaseIngredients();
        additionalIngredients.addAll(baseIngredients);
        additionalIngredients.add("tartar");
    }

    @Override
    public void printIngredients(){
        for (String item : additionalIngredients){
            System.out.println(item);
        }
    }

}
