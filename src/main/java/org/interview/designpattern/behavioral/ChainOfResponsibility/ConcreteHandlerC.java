package org.interview.designpattern.behavioral.ChainOfResponsibility;

public class ConcreteHandlerC extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals(RequestType.TYPE_C)) {
            System.out.println("ConcreteHandlerC handle request " + request.getName());
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
