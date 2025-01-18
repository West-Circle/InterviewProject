package org.interview.designpattern.behavioral.ChainOfResponsibility;

public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals(RequestType.TYPE_B)) {
            System.out.println("ConcreteHandlerB handle request " + request.getName());
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
