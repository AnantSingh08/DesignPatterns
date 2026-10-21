package behavioural.strategy.PaymentStrategies;

public class GPayPayment implements PaymentStrategy {
    private String pin;

    public GPayPayment(String pin) {
        this.pin = pin;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing $"+ amount + " payment through GPay");
    }
}
