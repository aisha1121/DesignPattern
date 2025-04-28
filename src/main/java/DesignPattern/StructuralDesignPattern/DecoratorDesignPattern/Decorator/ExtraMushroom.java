package DesignPattern.StructuralDesignPattern.DecoratorDesignPattern.Decorator;

import DesignPattern.StructuralDesignPattern.DecoratorDesignPattern.BasePizza;

public class ExtraMushroom extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraMushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
