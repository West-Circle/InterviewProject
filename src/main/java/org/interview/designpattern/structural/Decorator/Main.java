package org.interview.designpattern.structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza plainPizza = new PlainPizza();
        Pizza decoratedPizza = new Cheese(plainPizza);

        System.out.println("Description: " + decoratedPizza.getDescription());
        System.out.println("Cost: " + decoratedPizza.getCost());
    }
}
