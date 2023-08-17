package org.example;

import org.example.AbsFac.BankAbFact;
import org.example.AbsFac.FactoryCreator;
import org.example.Enums.AcType;
import org.example.Enums.Banks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        BankAbFact bankAbstractFactory = FactoryCreator.getFactory("bank");

        Bank bank = bankAbstractFactory.getBank(Banks.BankA.name());
        System.out.println("Where would you like to deposit your money: "+ Banks.BankA.name());

        double amount = Double.parseDouble("100000");
        System.out.println("Enter the amount: "+amount);

        int years = Integer.parseInt("1");
        System.out.println("Enter the tenure in years: "+years);

        Deposit deposit = (FactoryCreator.getFactory("deposit")).getDeposit(AcType.Saving.name());
        System.out.println("Which type of deposit?: "+AcType.Saving.name());
        deposit.getInterestRate();
        System.out.println("Your withdrawal amount will be: " + deposit.calculateWithdrawalAmount(amount, years));


    }
}



