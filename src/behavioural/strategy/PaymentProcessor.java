package behavioural.strategy;

import behavioural.strategy.PaymentStrategies.PaymentStrategy;

public class PaymentProcessor {
    private PaymentStrategy strategy;

    public PaymentProcessor(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    //Use constructor or setter
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processingPayment(double amount) {
        strategy.pay(amount);
    }
}
