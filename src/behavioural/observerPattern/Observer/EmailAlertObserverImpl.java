package behavioural.observerPattern.Observer;

import behavioural.observerPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String email;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.email = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendEmail(email, "product is back in stock");
    }

    private void sendEmail(String email, String mesaage) {
        System.out.println("Mail sent to: "+email);
    }
}
