package org.example.DecoratorPattern.Imp;

import org.example.DecoratorPattern.BasePizza;

public class Margherita extends BasePizza {
    @Override
    public int cost() {
        return 500;
    }
}
