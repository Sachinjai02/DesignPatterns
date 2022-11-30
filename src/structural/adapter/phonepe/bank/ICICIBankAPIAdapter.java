package structural.adapter.phonepe.bank;

import java.util.Map;

public class ICICIBankAPIAdapter implements BankAPIAdapter {
    //This is the 3rd party API
    private ICICIBankAPI iciciBankAPI;
    public ICICIBankAPIAdapter() {
        this.iciciBankAPI = new ICICIBankAPI();
    }
    @Override
    public double checkBalance(long accountNumber) {
        return Double.parseDouble(iciciBankAPI.getBalance(accountNumber));
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
