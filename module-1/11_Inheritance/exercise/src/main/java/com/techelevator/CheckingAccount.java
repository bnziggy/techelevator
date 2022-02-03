package com.techelevator;

public class CheckingAccount extends BankAccount {

    //Invoke super class constructors
    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }


    @Override
    public int withdraw(int amountToWithdraw) {
        if (getBalance() <= -100) {
            return getBalance();
        }

        int withdrawBalance = getBalance() - amountToWithdraw;  // Balance after withdraw

        if (withdrawBalance > 0) {
            super.withdraw(amountToWithdraw);
        }

        if (withdrawBalance >= -100 && withdrawBalance <= 0) {
            amountToWithdraw =  amountToWithdraw + 10;
            super.withdraw(amountToWithdraw);
        }

        return getBalance();
    }

}
