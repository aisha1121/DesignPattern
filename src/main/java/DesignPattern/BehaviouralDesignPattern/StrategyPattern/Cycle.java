package DesignPattern.BehaviouralDesignPattern.StrategyPattern;

import DesignPattern.BehaviouralDesignPattern.StrategyPattern.DriveStrategy.NormalDriveStrategy;

public class Cycle extends Vehicle{

    public Cycle() {
        super(new NormalDriveStrategy());
    }

    public void getType() {
        System.out.println("This is a cycle.");
    }
}
