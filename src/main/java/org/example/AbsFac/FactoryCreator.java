package org.example.AbsFac;

public class FactoryCreator {
    public static BankAbFact getFactory (String choice)
    {
        if (choice.equalsIgnoreCase("bank"))            return new BankFact();
        else if (choice.equalsIgnoreCase("deposit"))    return new DepositFact();

        return null;
    }
}
