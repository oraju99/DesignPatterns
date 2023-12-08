package com.example.decorator;

public class PizzaShopExample {
    public static void main(String[] args) {
        // order a plain pizza
        Pizza plainPizza = new PlainPizza();
        System.out.println("Cost : " + plainPizza.cost() + " Description : " + plainPizza.getDescription());

        // add cheese to the pizza
        Pizza cheesePizza = new CheeseTopping(plainPizza);
        System.out.println("Cost : " + cheesePizza.cost() + " Description : " + cheesePizza.getDescription());

        // add pepperoni and cheese to the pizza
        Pizza pepperoniPizza = new PepperoniTopping(new CheeseTopping(plainPizza));
        System.out.println("Cost : " + pepperoniPizza.cost() + " Description : " + pepperoniPizza.getDescription());
    }
}
