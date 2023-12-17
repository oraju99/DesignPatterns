package com.example.factory.pizza;

public class PizzaFactory {
    Pizza createPizza(String pizzaType) {
        if (pizzaType.equalsIgnoreCase("Paneer")) {
            return new Paneer();
        } else if (pizzaType.equalsIgnoreCase("Chicken")) {
            return new Chicken();
        }
        return null;
    }
}
