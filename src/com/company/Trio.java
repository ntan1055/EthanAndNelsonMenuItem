package com.company;

public class Trio implements MenuItem
{
    Sandwich sandwich;
    Salad salad;
    Drink drink;
    public Trio(Sandwich sandwich, Salad salad, Drink drink)
    {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }
    public String getName()
    {
        return sandwich.getName() + '/' + salad.getName() + '/' + drink.getName() + " Trio";
    }
    public double getPrice()
    {
        double sandwichPrice = sandwich.getPrice();
        double saladPrice = salad.getPrice();
        double drinkPrice = drink.getPrice();
        if (sandwichPrice <= saladPrice && sandwichPrice <= drinkPrice)
        {
            return saladPrice + drinkPrice;
        }
        else if (saladPrice <= sandwichPrice && saladPrice <= drinkPrice)
        {
            return sandwichPrice + drinkPrice;
        }
        else
        {
            return sandwichPrice + saladPrice;
        }
    }
}
