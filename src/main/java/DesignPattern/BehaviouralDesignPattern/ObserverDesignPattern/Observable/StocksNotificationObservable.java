package DesignPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observable;

import DesignPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observer.NotificationObserver;

public interface StocksNotificationObservable {
    void add(NotificationObserver observer);
    void delete(NotificationObserver observer);
    void notifySubscribers();
    void addStock(int stock);
}
