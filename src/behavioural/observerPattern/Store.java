package behavioural.observerPattern;

import behavioural.observerPattern.Observable.IphoneObservableImpl;
import behavioural.observerPattern.Observable.StockObservable;
import behavioural.observerPattern.Observer.EmailAlertObserverImpl;
import behavioural.observerPattern.Observer.MobileAlertObserverImpl;
import behavioural.observerPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("test1@gmail.com", iphoneObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("test2@gmail.com", iphoneObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("Anant", iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setStockCount(10);
    }
}
