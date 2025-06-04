package org.example.DecoratorPattern.Imp;

import org.example.DecoratorPattern.BasePizza;

public class VegDelight extends BasePizza {
    @Override
    public int cost() {
        return 100;
    }
}
