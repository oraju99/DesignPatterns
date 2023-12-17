package com.example.factory.pizza;

public class Paneer implements Pizza{
    @Override
    public void bake() {
        System.out.println("Baking the Paneer pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the Panner pizza");
    }

    @Override
    public void pack() {
        System.out.println("Packing the Paneer pizza");
    }
}
