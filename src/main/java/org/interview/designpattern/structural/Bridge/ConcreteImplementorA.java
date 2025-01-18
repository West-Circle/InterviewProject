package org.interview.designpattern.structural.Bridge;

public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorA operationImpl");
    }
}
