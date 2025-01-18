package org.interview.designpattern.creational.AbstractFactory;

public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        System.out.println("Create Product A2");
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        System.out.println("Create Product B2");
        return new ConcreteProductB2();
    }

}
