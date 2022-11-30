package structural.adapter.phonepe;

import structural.adapter.phonepe.bank.BankAPIAdapter;

public class PhonePe {
    //Dependency Inversion principle
    private BankAPIAdapter bankAPI;

    //Dependency Injection
    public PhonePe(BankAPIAdapter bankAPI) {
        this.bankAPI = bankAPI;
    }

    public void checkBalance(long accNumber, long minBalance) {
        double balance = this.bankAPI.checkBalance(accNumber);
        if(balance < minBalance) {
            throw new RuntimeException("Insufficient balance");
        }
    }
}
