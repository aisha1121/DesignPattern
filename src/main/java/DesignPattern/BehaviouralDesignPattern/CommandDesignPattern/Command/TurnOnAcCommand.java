package DesignPattern.BehaviouralDesignPattern.CommandDesignPattern.Command;

import DesignPattern.BehaviouralDesignPattern.CommandDesignPattern.Receiver.AC;

public class TurnOnAcCommand implements ICommand {

    AC ac;

    public TurnOnAcCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }

    @Override
    public void undo() {
        ac.turnOff();
    }
}
