package DesignPattern.BehaviouralDesignPattern.StrategyPattern;

/*
    * Transport.java
    * We use strategy pattern when the child classes share same method definitions (strategy)
    * which is not present in parent class.
    * for eg: normal and sporty driving strategy
    * easy way to duplicate code and write strategies in each class drive() implementation but this is not scalable code
    * we cannot make it generic in parent class so we add interface and initialise strategy in child classes
    * major focus on drive() method
*/
public class Transport {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.getType();
        car.drive();

        Vehicle cycle = new Cycle();
        cycle.getType();
        cycle.drive();

        Vehicle bike = new Bike();
        bike.getType();
        bike.drive();
    }
}
