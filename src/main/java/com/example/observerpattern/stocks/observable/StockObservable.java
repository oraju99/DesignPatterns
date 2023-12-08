package com.example.observerpattern.stocks.observable;

import com.example.observerpattern.stocks.observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver notificationAlertObserver);
    void remove(NotificationAlertObserver notificationAlertObserver);
    void notifySubscribers();
    void setStockCount(int newStockCount);
    int getStockCount();
}
