package DesignPattern.BehaviouralDesignPattern.StrategyPattern.DriveStrategy;

public class SportyDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sporty driving mode activated.");
    }
}
