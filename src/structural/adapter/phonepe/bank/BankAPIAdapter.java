package structural.adapter.phonepe.bank;

import java.util.Map;

/*
Always think of Adapter pattern when you are working with 3rd party APIs
:: This is an Adapter interface
 */
public interface BankAPIAdapter {
    public double checkBalance(long accountNumber);
    public boolean sendMoney(long accSender, long accReceiver, double amount);
    public Map<String, Object> getAccountDetails(long accountNumber);
}
