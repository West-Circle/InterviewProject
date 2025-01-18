package org.interview.designpattern.behavioral.Observer;

public class ConcreteObserver implements Observer {
    private String name;
    private int observerState;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int state) {
        observerState = state;
        System.out.println("Observer " + this.name + " state updated: " + observerState);
    }
}
