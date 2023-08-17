package org.example.Banks;

import org.example.Bank;
import org.example.Enums.Banks;

public class BankB implements Bank {

    private final String bankName = Banks.BankB.name();
    @Override
    public String getBankName() {
        return null;
    }
}
