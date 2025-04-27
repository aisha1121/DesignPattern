package DesignPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observer;

import DesignPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observable.StocksNotificationObservable;

public class EmailNotificationObserver implements NotificationObserver{

    StocksNotificationObservable notificationObservable;
    String email;

    public EmailNotificationObserver(StocksNotificationObservable observable, String email) {
        this.notificationObservable = observable;
        this.email = email;
    }

    @Override
    public void update(){
        System.out.println("New stocks arrived!! Hurry up!! Mail sent for email: "+ email);
    }
}
