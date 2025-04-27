package DesignPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observable;

import DesignPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStocksNotificationObservable implements StocksNotificationObservable {

    List<NotificationObserver> list = new ArrayList<>();
    public int currentStocks = 0;

    @Override
    public void add(NotificationObserver observer) {
        list.add(observer);
    }

    @Override
    public void delete(NotificationObserver observer) {
        list.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationObserver obj : list) {
            obj.update();
        }
    }

    @Override
    public void addStock(int stock) {
        if (currentStocks == 0) {
            notifySubscribers();
        }
        currentStocks = currentStocks + stock;
    }
}
