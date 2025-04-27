package DesignPattern.BehaviouralDesignPattern.CommandDesignPattern.Receiver;

public class AC {
    boolean isOn;
    int temperature;

    public void turnOn() {
        this.isOn = true;
        System.out.println("AC is turned on.");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("AC is turned off.");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to: " + temperature);
    }
}
