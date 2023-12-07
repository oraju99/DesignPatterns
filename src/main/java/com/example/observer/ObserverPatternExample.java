package com.example.observer;

public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        Fan fan = new Fan();

        // adding the observers
        weatherStation.addObserver(temperatureDisplay);
        weatherStation.addObserver(fan);

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(35);
    }
}
