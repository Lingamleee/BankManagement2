package org.example.Accounts;

import org.example.Deposit;

public class Savings extends Deposit {
    @Override
    protected void getInterestRate() {
        rate = 6.0;
    }
}
