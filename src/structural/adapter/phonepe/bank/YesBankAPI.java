package structural.adapter.phonepe.bank;

import java.util.Random;

public class YesBankAPI {

    public double getBalance(Long accNo) {
        return new Random(1000000).nextDouble(1000, 100000);
    }
}
