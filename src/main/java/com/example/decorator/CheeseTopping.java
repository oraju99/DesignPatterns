package com.example.decorator;

// Concrete Decorator: Cheese topping
public class CheeseTopping extends PizzaDecorator{
    public CheeseTopping(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Cheese";
    }

    @Override
    public double cost() {
        return super.cost() + 2.0;
    }
}
