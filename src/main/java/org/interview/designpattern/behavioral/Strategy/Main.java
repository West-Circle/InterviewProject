package org.interview.designpattern.behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategy1 = new ConcreteStrategy1();
        context.setStrategy(strategy1);
        context.executeStrategy();
        System.out.println("#####");
        Strategy strategy2 = new ConcreteStrategy2();
        context.setStrategy(strategy2);
        context.executeStrategy();
    }
}
