package com.example.decorator;

public class PepperoniTopping extends PizzaDecorator{
    public PepperoniTopping(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Pepperoni";
    }

    @Override
    public double cost() {
        return super.cost() + 3.0;
    }
}
