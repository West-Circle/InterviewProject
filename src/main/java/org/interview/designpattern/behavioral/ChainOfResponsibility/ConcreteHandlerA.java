package org.interview.designpattern.behavioral.ChainOfResponsibility;

public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals(RequestType.TYPE_A)) {
            System.out.println("ConcreteHandlerA handle request " + request.getName());
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
