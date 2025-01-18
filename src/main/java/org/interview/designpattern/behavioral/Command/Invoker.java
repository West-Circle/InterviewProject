package org.interview.designpattern.behavioral.Command;

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        System.out.println("Invoker is executing a command");
        command.execute();
    }
}
