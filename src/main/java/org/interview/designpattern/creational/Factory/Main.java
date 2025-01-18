package org.interview.designpattern.creational.Factory;

public class Main {
    public static void main(String[] args) {
        Product productA = Factory.createProduct("A");
        productA.anyMethod();

        Product productB = Factory.createProduct("B");
        productB.anyMethod();

        // don't have product C
        Product p = Factory.createProduct("C");
        p.anyMethod();
    }
}
