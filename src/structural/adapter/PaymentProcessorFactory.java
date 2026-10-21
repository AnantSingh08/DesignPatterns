package structural.adapter;

import java.util.Scanner;

public class PaymentProcessorFactory {
    public static PaymentProcessor createProcessor() {
        Scanner sc = new Scanner(System.in);

        PaymentProcessor processor = null;

        System.out.println("Select Payment Processor");
        System.out.println("1. Stripe");
        System.out.println("2. Razorpay");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter card number");
                String cardNumber = sc.nextLine();
                processor = new StripeAdapter(cardNumber);
                break;

            case 2:
                System.out.println("Enter phone number");
                String phoneNumber = sc.nextLine();
                processor = new RazorPayAdapter(phoneNumber);
                break;
            default:
                throw new IllegalArgumentException(
                        "Invalid payment method selected"
                );
        }
        sc.close();
        return processor;
    }
}
