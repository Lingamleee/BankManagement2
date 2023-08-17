package org.example.Accounts;

import org.example.Deposit;

public class Loan extends Deposit {
    @Override
    protected void getInterestRate() {
        rate = 10.0;
    }
}
