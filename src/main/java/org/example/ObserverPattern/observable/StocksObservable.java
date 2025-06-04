package org.example.ObserverPattern.observable;

import org.example.ObserverPattern.observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver observer);
    public  void remove(NotificationAlertObserver observer);
    public  void notifySubscribers();
    public void setStocksCount(int count);
    public  int getStocksCount();
}
