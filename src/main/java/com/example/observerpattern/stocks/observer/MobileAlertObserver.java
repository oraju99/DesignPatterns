package com.example.observerpattern.stocks.observer;

import com.example.observerpattern.stocks.observable.StockObservable;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class MobileAlertObserver implements NotificationAlertObserver{

    String userName;
    StockObservable observable;

    @Override
    public void update() {
        sendMessageOnMobile(userName, "Product is in stock hurry up");
    }

    private void sendMessageOnMobile( String userName, String msg ) {
        System.out.println("Msg sent to " + userName);
    }
}
