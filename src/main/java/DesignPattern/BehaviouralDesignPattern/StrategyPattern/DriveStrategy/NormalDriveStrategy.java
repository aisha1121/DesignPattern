package DesignPattern.BehaviouralDesignPattern.StrategyPattern.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal driving mode activated.");
    }
}
