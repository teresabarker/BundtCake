package edu.psu.ist;

public class Main {

    public static void main(String[] args) {
	//Cake cake = new Cake();  //Cannot be instantiated

        AngelFood angelCake = new AngelFood();
        System.out.println("Angel's Food Ingredients:");
        angelCake.printIngredients();
        System.out.print("\n");

        DevilFood devilCake = new DevilFood();
        System.out.println("Devils's Food Ingredients:");
        devilCake.printIngredients();
        System.out.print("\n");

        Bundt bundtCake = new Bundt();
        System.out.println("Bundt Cake's Ingredients:");
        bundtCake.printIngredients();
        System.out.print("\n");
    }
}
