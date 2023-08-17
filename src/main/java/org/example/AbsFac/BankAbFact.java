package org.example.AbsFac;

import org.example.Bank;
import org.example.Deposit;

public abstract class BankAbFact {
    public abstract Bank getBank(String bank);
    public abstract Deposit getDeposit (String deposit);
}
