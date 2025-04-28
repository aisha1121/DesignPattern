package DesignPattern.StructuralDesignPattern.AdapterDesignPattern.Client;

import DesignPattern.StructuralDesignPattern.AdapterDesignPattern.Adaptee.BabyWeightMachine;
import DesignPattern.StructuralDesignPattern.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import DesignPattern.StructuralDesignPattern.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

/*
    * adapter design pattern is like a mapper.
    * when client needs data which is not in form of the response sent by server
    * then an adapter b/w these two layers act as a converter / mapper
 */
public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new BabyWeightMachine());
        double weight = weightMachineAdapter.getWeightInKg();
        System.out.println("Weight in KG: " + weight);
    }
}
