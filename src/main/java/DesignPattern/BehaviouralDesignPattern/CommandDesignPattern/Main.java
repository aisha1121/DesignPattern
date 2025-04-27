package DesignPattern.BehaviouralDesignPattern.CommandDesignPattern;

import DesignPattern.BehaviouralDesignPattern.CommandDesignPattern.Command.TurnOffAcCommand;
import DesignPattern.BehaviouralDesignPattern.CommandDesignPattern.Command.TurnOnAcCommand;
import DesignPattern.BehaviouralDesignPattern.CommandDesignPattern.Invoker.RemoteControl;
import DesignPattern.BehaviouralDesignPattern.CommandDesignPattern.Receiver.AC;

/*
    * turns an action into a full object
    * eg: turning on an ac
 */
public class Main {
    public static void main(String[] args) {
        AC ac = new AC();
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(new TurnOnAcCommand(ac));
        remoteControl.pressButton();
        remoteControl.setCommand(new TurnOffAcCommand(ac));
        remoteControl.pressButton();

        remoteControl.undo();
    }

}
