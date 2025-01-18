package org.interview.designpattern.structural.Bridge;

public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorB operationImpl");
    }
}
