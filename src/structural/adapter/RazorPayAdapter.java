package structural.adapter;

public class RazorPayAdapter implements PaymentProcessor {
    //private Razorpay client

    private String phoneNumber;
    private static final double USD_TO_INR = 103.0;

    public RazorPayAdapter(String phoneNumber) {
        //this.client = new RazorpayClient("ketId","keySecret");
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void pay(double amountInUSD) {

        double amountInInr = amountInUSD * USD_TO_INR;
        int amountInPaise = (int) (amountInInr*100);

        //client.createPayment(phoneNumber, amountInPaise);

        System.out.println("Razorpay: paid"+amountInPaise/100.0 + "Rs using phoneNumber");

    }
}
