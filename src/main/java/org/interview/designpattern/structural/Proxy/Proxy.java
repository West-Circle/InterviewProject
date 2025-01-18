package org.interview.designpattern.structural.Proxy;

public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy() {
        this.realSubject = new RealSubject();
    }

    @Override
    public void request() {
        System.out.println("Proxy: Pre-processing request.");
        // real subject method
        realSubject.request();
        System.out.println("Proxy: Post-processing request.");
    }
}
