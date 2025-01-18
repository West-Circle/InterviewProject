package org.interview.designpattern.behavioral.Command;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommand command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
