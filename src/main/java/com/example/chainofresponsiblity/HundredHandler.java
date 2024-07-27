package com.example.chainofresponsiblity;

public class HundredHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Integer request) {
        if (request/100 > 0) {
            System.out.println("Giving " + request/100 + " notes of Rs.100");
            nextHandler.handleRequest(request%100);
        } else {
            System.out.println("Not giving any Rs.100 note");
        }
    }
}
