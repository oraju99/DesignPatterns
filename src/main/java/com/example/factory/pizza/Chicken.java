package com.example.factory.pizza;

public class Chicken implements Pizza{
    @Override
    public void bake() {
        System.out.println("Baking the Chicken pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the Chicken pizza");
    }

    @Override
    public void pack() {
        System.out.println("Packing the Chicken pizza");
    }
}
