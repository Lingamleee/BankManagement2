package org.example.Banks;

import org.example.Bank;
import org.example.Enums.Banks;

public class BankA implements Bank {

    private final String bankName = Banks.BankA.name();
    @Override
    public String getBankName() {
        return bankName;
    }
}
