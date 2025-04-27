package DesignPattern.BehaviouralDesignPattern.StrategyPattern;

import DesignPattern.BehaviouralDesignPattern.StrategyPattern.DriveStrategy.DriveStrategy;

public class Vehicle {
    private final DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void getType() {
        System.out.println("This is a vehicle.");
    }

    public void drive() {
        driveStrategy.drive();
    }
}
