package com.example.strategy;

public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        PaymentStrategy cashPayment = new CashPayment();

        ShoppingCart cart1 = new ShoppingCart();
        cart1.setPaymentStrategy(creditCardPayment);
        cart1.checkout(20);

        ShoppingCart cart2 = new ShoppingCart();
        cart2.setPaymentStrategy(cashPayment);
        cart2.checkout(30);
    }
}
