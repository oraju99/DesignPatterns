package com.example.observerpattern.stocks;

import com.example.observerpattern.stocks.observable.IphoneObservableImpl;
import com.example.observerpattern.stocks.observable.StockObservable;
import com.example.observerpattern.stocks.observer.EmailAlertObserverImpl;
import com.example.observerpattern.stocks.observer.MobileAlertObserver;
import com.example.observerpattern.stocks.observer.NotificationAlertObserver;

public class StockObserverPatternExample {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("email1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("email2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("user3", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
