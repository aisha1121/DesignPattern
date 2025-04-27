package DesignPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observer;

import DesignPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observable.StocksNotificationObservable;

public class SmsObserver implements NotificationObserver{
    private StocksNotificationObservable notificationObservable;
    String userName;

    public SmsObserver (StocksNotificationObservable observable, String name) {
        this.notificationObservable = observable;
        this.userName = name;
    }

    @Override
    public void update(){
        System.out.println("New stocks arrived!! Hurry up!! SMS sent for user: "+ userName);
    }
}
