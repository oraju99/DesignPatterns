package com.example.factory.pizza;

public class Factory {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza paneerPizza = pizzaFactory.createPizza("Paneer");
        paneerPizza.bake();
        paneerPizza.pack();
        paneerPizza.cut();

        Pizza chickenPizza = pizzaFactory.createPizza("Chicken");
        chickenPizza.bake();
        chickenPizza.cut();
        chickenPizza.pack();

    }
}
