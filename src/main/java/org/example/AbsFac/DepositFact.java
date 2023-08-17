package org.example.AbsFac;

import org.example.Accounts.Current;
import org.example.Accounts.Loan;
import org.example.Accounts.Savings;
import org.example.Bank;
import org.example.Deposit;
import org.example.Enums.AcType;

public class DepositFact extends BankAbFact {
    @Override
    public Bank getBank(String bank)
    {
        return null;
    }

    @Override
    public Deposit getDeposit(String deposit)
    {
        if (deposit.equalsIgnoreCase(AcType.Saving.name()))        return new Savings();
        else if (deposit.equalsIgnoreCase(AcType.Current.name()))     return new Current();
        else if (deposit.equalsIgnoreCase(AcType.Loan.name())) return new Loan();

        return null;
    }
}