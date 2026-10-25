package structural.facade;

public class Account {
    public boolean verifyAccount(String accNo) {
        System.out.println("Account verified: "+ accNo);
        return true;
    }
}
