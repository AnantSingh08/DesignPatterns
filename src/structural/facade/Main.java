package structural.facade;

public class Main {
    public static void main(String[] args) {
        BankFacade bank = new BankFacade();
        bank.withdraw("Acc123", "4321", 1000.0);
    }
}
