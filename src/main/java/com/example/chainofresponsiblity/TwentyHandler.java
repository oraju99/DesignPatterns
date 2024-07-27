package com.example.chainofresponsiblity;

public class TwentyHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Integer request) {
        if (request/20 > 0) {
            System.out.println("Giving " + request/20 + " notes of Rs.20");
            nextHandler.handleRequest(request%20);
        } else {
            System.out.println("Not giving any Rs.20 note");
        }
    }
}
