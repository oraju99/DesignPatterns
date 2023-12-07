package com.example.strategy;

import lombok.Data;

@Data
public class CashPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Payment done with cash for amount : " + amount);
    }
}
