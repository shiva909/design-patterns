package org.example.DecoratorPattern.Imp;

import org.example.DecoratorPattern.BasePizza;
import org.example.DecoratorPattern.ToppingDecorator;

public class Mushroom extends ToppingDecorator {
    BasePizza basePizza;
    public Mushroom(BasePizza pizza){
        basePizza=pizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+35;
    }
}
