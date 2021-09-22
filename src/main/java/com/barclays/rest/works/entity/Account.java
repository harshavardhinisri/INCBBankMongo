package com.barclays.rest.works.entity;

public class Account {
    private int accId;
    private double balance;


    public Account (){}
    public Account(int accId, double balance) {
        this.accId = accId;
        this.balance = balance;
    }

    public double getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
