package structural.adapter.phonepe.bank;

import java.util.Random;

public class ICICIBankAPI {
    public String getBalance(Long accNo) {
        return new Random(1000000).nextLong(100000) + "";
    }
}
