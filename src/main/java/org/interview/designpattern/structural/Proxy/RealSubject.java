package org.interview.designpattern.structural.Proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject handling request()");
    }
}
