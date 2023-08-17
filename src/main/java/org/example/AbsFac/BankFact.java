package org.example.AbsFac;

import org.example.Bank;
import org.example.Banks.BankA;
import org.example.Banks.BankB;
import org.example.Banks.BankC;
import org.example.Deposit;

public class BankFact extends BankAbFact{

    @Override
    public Bank getBank(String bank)
    {
        if (bank.equalsIgnoreCase("bank a"))        return new BankA();
        else if (bank.equalsIgnoreCase("bank b"))   return new BankB();
        else if (bank.equalsIgnoreCase("bank c"))   return new BankC();

        return null;
    }

    @Override
    public Deposit getDeposit(String deposit)
    {
        return null;
    }
}