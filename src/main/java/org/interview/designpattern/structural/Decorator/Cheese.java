package org.interview.designpattern.structural.Decorator;

public class Cheese extends PizzaDecorator {
    protected Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}
