package com.example.lld.logger;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logObject.log(1, "Message 1");
        logObject.log(2, "Message 2");
        logObject.log(3, "Message 3");
    }
}
