package behavioural.strategy.PaymentStrategies;

public class CreditCardPayment implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String expirydate;

    public CreditCardPayment(String name,String cardNumber, String cvv, String expirydate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirydate = expirydate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing $"+amount+" payment with Credit Card belonging to "+name);
    }
}
