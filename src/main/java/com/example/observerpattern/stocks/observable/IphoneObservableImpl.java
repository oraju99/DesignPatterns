package com.example.observerpattern.stocks.observable;

import com.example.observerpattern.stocks.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{
    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        observerList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        observerList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver notificationAlertObserver : observerList) {
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if (stockCount == 0) {
            notifySubscribers();
        }
        stockCount += newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
