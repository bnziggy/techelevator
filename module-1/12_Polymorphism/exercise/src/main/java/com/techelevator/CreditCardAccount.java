package com.techelevator;

public class CreditCardAccount implements Accountable {

    private String accountHolder;
    private String accountNumber;
    private int debt;


    //Constructor
    public CreditCardAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        debt = 0;
    }


    //Methods
    public int pay(int amountToPay) {
        return debt -= amountToPay;
    }

    public int charge(int amountToCharge) {
        return debt += amountToCharge;
    }

    //Implement Accountable interface
    public int getBalance() {
        return -debt;
    }


    //Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }
}
