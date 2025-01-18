package org.interview.designpattern.creational.Factory;

public class Factory {

    public static Product createProduct(String type) {
        if (type.equals("A")) {
            // create Product A
            return new ConcreteProductA();
        } else if (type.equals("B")) {
            return new ConcreteProductB();
        } else
            throw new IllegalArgumentException("No such product");
    }
}
