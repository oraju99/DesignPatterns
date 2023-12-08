package com.example.observerpattern.stocks.observer;

import com.example.observerpattern.stocks.observable.StockObservable;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;

    @Override
    public void update() {
        sendEmail(emailId, "product is in stock hurry up");
    }

    private void sendEmail(String emailId, String msg) {
        System.out.println("Mail sent to : " + emailId);
    }
}
