package org.example;

public abstract class Deposit{
    protected double rate;
    protected abstract void getInterestRate();
    public double calculateWithdrawalAmount(double amount, int tenure)
    {
        return Math.floor(amount*(Math.pow((1+(rate/400)), (tenure*4))));
    }

}
