package org.interview.designpattern.creational.Builder;

public class Main {
    public static void main(String[] args) {
        // director
        Director director = new Director();

        Builder builderA = new ConcreteBuilderA();
        director.setBuilder(builderA);
        Product productA = director.construct();
        productA.show();

        Builder builderB = new ConcreteBuilderB();
        director.setBuilder(builderB);
        Product productB = director.construct();
        productB.show();
    }
}
