package structural.adapter;

public class StripeAdapter implements PaymentProcessor {
    //real stripe SDK uses static methods, no client object ideally
    private String cardNumber;

    public StripeAdapter(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(double amountInUSD) {
        //client.makePayment(cardNumber, amountInUSD);
        System.out.println("Stripe: Paid:$" + amountInUSD + " using card" + cardNumber);
    }
}
