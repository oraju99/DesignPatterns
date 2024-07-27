package com.example.chainofresponsiblity;

public interface Handler {
    void setNextHandler(Handler nextHandler);
    void handleRequest(Integer request);
}
