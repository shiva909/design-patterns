package org.example.ObserverPattern.observable;

import org.example.ObserverPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImp implements  StocksObservable{
    public List<NotificationAlertObserver> observerList;
    public int stockCount=0;
    public IphoneObservableImp(){
        observerList=new ArrayList<>();
    }
    @Override
    public void add(NotificationAlertObserver obj) {
        observerList.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
    for(NotificationAlertObserver obj:observerList){
        obj.giveUpdate();
    }
    }

    @Override
    public void setStocksCount(int count) {
    if(stockCount==0){
        notifySubscribers();
    }
    stockCount+=count;
    }

    @Override
    public int getStocksCount() {
        return stockCount;
    }
}
