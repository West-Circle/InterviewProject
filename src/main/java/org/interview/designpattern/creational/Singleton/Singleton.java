package org.interview.designpattern.creational.Singleton;

/**
 * Singleton
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void anyMethod() {
        System.out.println("Any method");
    }

}