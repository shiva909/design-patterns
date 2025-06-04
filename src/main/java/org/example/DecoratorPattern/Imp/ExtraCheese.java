package org.example.DecoratorPattern.Imp;

import org.example.DecoratorPattern.BasePizza;
import org.example.DecoratorPattern.ToppingDecorator;

public class ExtraCheese extends ToppingDecorator {
    BasePizza basePizza;
    public ExtraCheese(BasePizza pizza){
        basePizza=pizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+15;
    }
}
