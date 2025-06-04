package org.example.DecoratorPattern.Imp;

import org.example.DecoratorPattern.BasePizza;

public class Farmhouse extends BasePizza {
    @Override
    public int cost() {
        return 200;
    }
}
