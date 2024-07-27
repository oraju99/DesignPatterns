package com.example.chainofresponsiblity;

public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        HundredHandler hundredHandler = new HundredHandler();
        TwentyHandler twentyHandler = new TwentyHandler();
        OneHandler oneHandler = new OneHandler();
        hundredHandler.setNextHandler(twentyHandler);
        twentyHandler.setNextHandler(oneHandler);
        hundredHandler.handleRequest(125);
    }
}
