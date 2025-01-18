package org.interview.designpattern.structural.Bridge;

public class ConcreteAbstractionB extends Abstraction {
    public ConcreteAbstractionB(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("ConcreteAbstractionB operation");
        implementor.operationImpl();
    }
}
