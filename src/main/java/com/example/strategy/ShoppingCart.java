package com.example.strategy;

import lombok.Data;

@Data
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
