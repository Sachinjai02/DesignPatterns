package structural.adapter.phonepe.client;

import structural.adapter.phonepe.PhonePe;
import structural.adapter.phonepe.bank.ICICIBankAPIAdapter;

public class Main {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe(new ICICIBankAPIAdapter());
        phonePe.checkBalance(123, 70000);
    }
}
