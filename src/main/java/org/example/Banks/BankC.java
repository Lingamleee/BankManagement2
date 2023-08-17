package org.example.Banks;

import org.example.Bank;
import org.example.Enums.Banks;

public class BankC implements Bank {

    private final String bankName = Banks.BankC.name();
    @Override
    public String getBankName() {
        return null;
    }
}
