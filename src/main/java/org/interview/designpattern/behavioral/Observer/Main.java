package org.interview.designpattern.behavioral.Observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver("Peter");
        ConcreteObserver observer2 = new ConcreteObserver("Jane");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.setState(1);
        subject.setState(2);
        subject.removeObserver(observer1); // remove peter observer
        subject.setState(3);
    }
}
