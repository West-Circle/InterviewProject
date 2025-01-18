package org.interview.designpattern.structural.Bridge;

public class ConcreteAbstractionA extends Abstraction {
    public ConcreteAbstractionA(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("ConcreteAbstractionA operation");
        implementor.operationImpl();
    }
}
