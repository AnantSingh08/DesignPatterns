package structural.facade;

public class BankFacade {
    private final Account account;
    private final Security security;
    private final Funds funds;
    private final Notification notification;

    public BankFacade() {
        account = new Account();
        security = new Security();
        funds = new Funds();
        notification = new Notification();
    }

    public void withdraw(String accNo, String pin, double amount) {
        System.out.println("Starting withdrawal process ...");
        if(account.verifyAccount(accNo) && security.checkPin(pin)&&funds.hasSufficientFunds(amount)) {
            funds.debit(amount);
            notification.sendNotification("Withdrawal of $"+amount+ "successful");
        } else {
            System.out.println("Withdrawal failed");
        }
    }
}
