package com.example.strategy;

import lombok.Data;

@Data
public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Payment done with credit card for amount : " + amount);
    }
}
