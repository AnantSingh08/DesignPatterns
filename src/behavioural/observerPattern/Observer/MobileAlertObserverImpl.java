package behavioural.observerPattern.Observer;

import behavioural.observerPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String userName, StockObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMessageOndevice(userName, "product is back in stock");
    }

    private void sendMessageOndevice(String email, String mesaage) {
        System.out.println("Message sent to: "+userName);
    }
}