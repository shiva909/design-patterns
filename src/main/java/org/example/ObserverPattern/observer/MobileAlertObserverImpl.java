package org.example.ObserverPattern.observer;

import org.example.ObserverPattern.observable.IphoneObservableImp;
import org.example.ObserverPattern.observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    public String userName;
    public StocksObservable stocksObservable;
    public MobileAlertObserverImpl(String name,StocksObservable observable){
        userName=name;
        stocksObservable=observable;
    }

    @Override
    public void giveUpdate() {
        sendMsgOnMobile();
    }
    public void sendMsgOnMobile(){
        int stock=stocksObservable.getStocksCount();
        System.out.println(userName+": products is in stock hurry up!");
    }
}
