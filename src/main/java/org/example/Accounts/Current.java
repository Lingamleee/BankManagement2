package org.example.Accounts;

import org.example.Deposit;

public class Current extends Deposit {
    @Override
    public void getInterestRate()
    {
        rate = 7.0;
    }
}
