package org.interview.designpattern.structural.adapter;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("Adapter request method call adaptee specific request");
        adaptee.specificRequest();
    }

}
