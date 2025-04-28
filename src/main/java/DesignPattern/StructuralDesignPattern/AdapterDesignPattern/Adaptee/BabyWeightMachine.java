package DesignPattern.StructuralDesignPattern.AdapterDesignPattern.Adaptee;

public class BabyWeightMachine implements WeightMachine {
    @Override
    public double getWeightInPound() {
        return 20;
    }
}
