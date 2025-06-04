package org.example.ObserverPattern.observer;

import org.example.ObserverPattern.observable.IphoneObservableImp;
import org.example.ObserverPattern.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    public StocksObservable stocksObservable;
    public String email;
    public EmailAlertObserverImpl(String mail,StocksObservable observable){
        email=mail;
        stocksObservable=observable;
    }
    @Override
    public void giveUpdate() {
        sendMail();
    }
    public void sendMail(){
        int stock=stocksObservable.getStocksCount();
        System.out.println(email+": products is in stock hurry up!");
    }
}
