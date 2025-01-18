package org.interview.designpattern.creational.Builder;

public class ConcreteBuilderB extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("PartA from ConcreteBuilderB");
    }

    @Override
    public void buildPartB() {
        product.setPartB("PartB from ConcreteBuilderB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("PartC from ConcreteBuilderB");
    }
}
