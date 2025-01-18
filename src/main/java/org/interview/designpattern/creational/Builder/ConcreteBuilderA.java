package org.interview.designpattern.creational.Builder;

public class ConcreteBuilderA extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("PartA from ConcreteBuilderA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("PartB from ConcreteBuilderA");
    }

    @Override
    public void buildPartC() {
        product.setPartC("PartC from ConcreteBuilderA");
    }
}
