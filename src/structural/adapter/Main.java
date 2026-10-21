package structural.adapter;

public class Main {
    public static void main(String[] args) {
        double amount = 100;
        PaymentProcessor processor = PaymentProcessorFactory.createProcessor();

        //Here we have implemented strategy design pattern because at runtime pay func. will behave differently
        processor.pay(amount);
    }
}
