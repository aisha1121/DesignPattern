package DesignPattern.BehaviouralDesignPattern.StrategyPattern;

import DesignPattern.BehaviouralDesignPattern.StrategyPattern.DriveStrategy.SportyDriveStrategy;

public class Car extends Vehicle{

    public Car() {
        super(new SportyDriveStrategy());
    }

    @Override
    public void getType() {
        System.out.println("This is a car.");
    }

    public int getWheels() {
        return 4;
    }
}
