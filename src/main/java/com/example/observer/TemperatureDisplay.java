package com.example.observer;

public class TemperatureDisplay implements Observer{
    @Override
    public void update(int temperature) {
        System.out.println("Temperature Display : " + temperature);
    }
}
