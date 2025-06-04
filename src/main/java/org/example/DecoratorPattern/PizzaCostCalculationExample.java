package org.example.DecoratorPattern;

import org.example.DecoratorPattern.Imp.ExtraCheese;
import org.example.DecoratorPattern.Imp.Mushroom;
import org.example.DecoratorPattern.Imp.VegDelight;

public class PizzaCostCalculationExample {
    public static void main(String[] args) {
    //veg+mushroom pizza cost
        BasePizza pizza=new Mushroom(new VegDelight());
        System.out.println("Cost of Veg + Mushroom:"+pizza.cost());
    //veg+ mushroom+ extracheese+ mushroom   [3 lAYERS-Topping]
        BasePizza pizza1=new Mushroom(new ExtraCheese(new Mushroom(new VegDelight())));
        System.out.println("Veg +Mushroom+ ExtraCheese+ Mushroom PizaCost:"+pizza1.cost());
    }
}
