package DesignPattern.BehaviouralDesignPattern.CommandDesignPattern.Command;

import DesignPattern.BehaviouralDesignPattern.CommandDesignPattern.Receiver.AC;

public class TurnOffAcCommand implements ICommand {

    AC ac;

    public TurnOffAcCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }

    @Override
    public void undo() {
        ac.turnOn();

    }
}
