package DesignPattern.BehaviouralDesignPattern.CommandDesignPattern.Invoker;

import DesignPattern.BehaviouralDesignPattern.CommandDesignPattern.Command.ICommand;

import java.util.Stack;

public class RemoteControl {

    ICommand command;
    Stack<ICommand> st;

    public RemoteControl() {
        st = new Stack<>();
    }

    public void setCommand(ICommand iCommand) {
        this.command = iCommand;
    }

    public void pressButton() {
        command.execute();
        st.add(command);
    }

    public void undo() {
        if (!st.isEmpty()) {
            ICommand lastCommand = st.pop();
            lastCommand.undo();
        }
    }
}
