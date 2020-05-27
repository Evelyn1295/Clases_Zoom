package com.ironhack.classes;


import java.math.BigDecimal;

/**
 * The Account object should have name, address, accountNumber, and balance properties.
 * **/
public class Account {

    private String name;
    private String address;
    private String accountNumber;
    private Money balance;

    public Account(String name, String address, String accountNumber, Money balance) {
        this.name = name;
        this.address = address;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Money getBalance() {
        return balance;
    }

    public void setBalance(Money balance) {
        this.balance = balance;
    }

    public void increaseAmount(Money addAmount)
    {
        //setBalance(new Money(addAmount.getAmount().add(getBalance().getAmount())));
        this.balance.increaseAmount(addAmount);

    }

    public void decreaseAmount(Money addAmount) {

        //setBalance(new Money(addAmount.getAmount().subtract(getBalance().getAmount())));
        this.balance.decreaseAmount(addAmount);

    }
}
