package org.interview.designpattern.creational.AbstractFactory;

public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        System.out.println("Create Product A1");
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        System.out.println("Create Product B1");
        return new ConcreteProductB1();
    }
}
