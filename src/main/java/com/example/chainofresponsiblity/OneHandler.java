package com.example.chainofresponsiblity;

public class OneHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Integer request) {
        if (request > 0) {
            System.out.println("Giving " + request + " notes of Rs.1");
        } else {
            System.out.println("Not giving any Rs.1 note");
        }
    }
}
