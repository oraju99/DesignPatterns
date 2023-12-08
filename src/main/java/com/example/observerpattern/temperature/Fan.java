package com.example.observerpattern.temperature;

public class Fan implements Observer{
    @Override
    public void update(int temperature) {
        if (temperature > 30) {
            System.out.println("It is very hot outside don't step out, switching on the fan");
        } else {
            System.out.println("Yes it is cool turning off the fan");
        }
    }
}
