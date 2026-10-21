package behavioural.strategy.PaymentStrategies;

import java.util.Scanner;

public class PaymentStrategyFactory {
    public static PaymentStrategy createPaymentStrategy() {
        PaymentStrategy strategy;
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Payment Method:");
        System.out.println("1. PayPal");
        System.out.println("2. G Pay");
        System.out.println("3. Credit Card");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter your PayPal email:");
                String email = sc.nextLine();
                strategy = new PayPalPayment(email);
                break;

            case 2:
                System.out.println("Enter your GPay pin:");
                String pin = sc.nextLine();
                strategy = new GPayPayment(pin);
                break;

            case 3:
                System.out.println("Enter your name:");
                String name = sc.nextLine();
                System.out.println("Enter your card number:");
                String cardNumber = sc.nextLine();
                System.out.println("Enter your card's Expiry Date:");
                String expiry = sc.nextLine();
                System.out.println("Enter your cvv:");
                String cvv = sc.nextLine();

                strategy = new CreditCardPayment(name, cardNumber, cvv, expiry);
                break;

            default:
                throw new IllegalArgumentException(
                        "Invalid payment method selected"
                );
        }
        sc.close();
        return strategy;
    }
}
