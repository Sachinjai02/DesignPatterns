package structural.adapter.phonepe.bank;

import java.util.Map;

public class YesBankAPIAdapter implements BankAPIAdapter {
    private YesBankAPI yesBankAPI;
    public YesBankAPIAdapter() {
        this.yesBankAPI = new YesBankAPI();
    }
    @Override
    public double checkBalance(long accountNumber) {
        return this.yesBankAPI.getBalance(accountNumber);
    }

    @Override
    public boolean sendMoney(long accSender, long accReceiver, double amount) {
        return false;
    }

    @Override
    public Map<String, Object> getAccountDetails(long accountNumber) {
        return null;
    }
}
