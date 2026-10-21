package behavioural.strategy;

import behavioural.strategy.PaymentStrategies.*;

public class Main {
    public static void main(String[] args) {

        double amount = 100;

        PaymentStrategy strategy = PaymentStrategyFactory.createPaymentStrategy();

        //Use context to process payment

        PaymentProcessor processor = new PaymentProcessor(strategy);
        processor.processingPayment(amount);

    }
}
