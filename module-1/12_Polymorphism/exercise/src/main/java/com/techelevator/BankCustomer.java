package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable {

    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>(); //List of customer's accountables


    // Methods
    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }

    @Override
    public int getBalance() {
        return 0;
    }

    public boolean isVip() {
        int accountTotal = 0;

        for (Accountable account : accounts) {
            accountTotal += account.getBalance();
        }

        if (accountTotal >= 25000) {
            return true;
        }
        else {
            return false;
        }
    }


    // Getter for List of accounts
    public Accountable[] getAccounts() {
        return accounts.toArray(new Accountable[accounts.size()]);
    }

    // Getters and Setters name - phone#
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
