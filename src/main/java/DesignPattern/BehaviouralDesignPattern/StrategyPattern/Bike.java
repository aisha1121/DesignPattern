package DesignPattern.BehaviouralDesignPattern.StrategyPattern;

import DesignPattern.BehaviouralDesignPattern.StrategyPattern.DriveStrategy.SportyDriveStrategy;

public class Bike extends Vehicle{
    public Bike() {
        super(new SportyDriveStrategy());
    }
}
