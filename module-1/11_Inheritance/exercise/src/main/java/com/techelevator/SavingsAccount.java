package com.techelevator;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        int withdrawBalance = this.getBalance() - amountToWithdraw;

        if (withdrawBalance <= 1) {
            return getBalance();
        }

        if (withdrawBalance >= 150) {
            super.withdraw(amountToWithdraw);
        }
        else {
            amountToWithdraw = amountToWithdraw + 2;
            super.withdraw(amountToWithdraw);
        }

       /* if (withdrawBalance < 150 && withdrawBalance >= 2) {
            withdrawBalance = withdrawBalance - 2;
            //super.withdraw(withdrawBalance);
            return withdrawBalance;
        }*/


        return getBalance();
    }
}
