package org.interview.designpattern.behavioral.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        Request requestA = new Request("RequestA", RequestType.TYPE_A);
        Request requestB = new Request("RequestB", RequestType.TYPE_B);
        Request requestC = new Request("RequestC", RequestType.TYPE_C);

        handlerA.handleRequest(requestA);
        handlerA.handleRequest(requestB);
        handlerA.handleRequest(requestC);
    }
}
