package org.example.ObserverPattern;

import org.example.ObserverPattern.observable.IphoneObservableImp;
import org.example.ObserverPattern.observable.StocksObservable;
import org.example.ObserverPattern.observer.EmailAlertObserverImpl;
import org.example.ObserverPattern.observer.MobileAlertObserverImpl;
import org.example.ObserverPattern.observer.NotificationAlertObserver;

/*
KeyTakeWay
1)Send StocksObservable inside as constructor only
Don't use new in EmailAl...Class and it will create new object and it will take that empty stocks count
2)Mostly Use Parent Reference only (left side ...) i.e StocksObservable not like this..IphoneObservableImp
 --I mean to say depend on interface only..DIP Principle..
 */

public class AmazonWebsite {
    public static void main(String[] args) {
        StocksObservable stocksObservable=new IphoneObservableImp();
        NotificationAlertObserver observer1=new EmailAlertObserverImpl("venkatshiva761@gmail.com",stocksObservable);
        NotificationAlertObserver observer2=new EmailAlertObserverImpl("sai101@gmail.com",stocksObservable);
        MobileAlertObserverImpl observer3=new MobileAlertObserverImpl("rohit",stocksObservable);

        stocksObservable.add(observer1);
        stocksObservable.add(observer2);
        stocksObservable.add(observer3);

        stocksObservable.setStocksCount(100);
//     To See Data Count also uncomment below
//        stocksObservable.setStocksCount(100);


    }
}
