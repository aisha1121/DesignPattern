package DesignPattern.BehaviouralDesignPattern.ObserverDesignPattern;

import DesignPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observable.IphoneStocksNotificationObservable;
import DesignPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observable.StocksNotificationObservable;
import DesignPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observer.EmailNotificationObserver;
import DesignPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observer.SmsObserver;

/*
    * One object (subject) changes, and many other objects (observers) need to be automatically notified and updated.
    * You don’t want tight coupling between the subject and observers
    * meaning the subject doesn't know exact details about who is listening.
    * eg: when an item stocks become 0 and people click on notifyMe option
    * as soon as inventory brings up stock -> all observers are sent notification
 */
public class Store {
    public static void main(String[] args) {
        StocksNotificationObservable observable = new IphoneStocksNotificationObservable();

        observable.add(new EmailNotificationObserver(observable, "aisha@gmail.com"));
        observable.add(new EmailNotificationObserver(observable, "aayusha@gmail.com"));
        observable.add(new SmsObserver(observable, "aayusha"));

        observable.addStock(5);
        observable.addStock(5);


    }
}
