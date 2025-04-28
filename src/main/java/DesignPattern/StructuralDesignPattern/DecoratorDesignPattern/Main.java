package DesignPattern.StructuralDesignPattern.DecoratorDesignPattern;

import DesignPattern.StructuralDesignPattern.DecoratorDesignPattern.Decorator.ExtraCheese;

/*
    * This helps to add more functionality to existing object, without changing its structure.
    *
 */
public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new PeppyPaneerPizza());
        int cost = pizza.cost();
        System.out.println("Cost of peppy paneer with extra cheese: " + cost);
    }
}
