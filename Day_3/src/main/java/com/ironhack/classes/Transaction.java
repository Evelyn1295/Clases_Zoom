package com.ironhack.classes;

import java.util.Date;
import java.util.Objects;

/**
 * Transaction objects should have sellerAccountNumber, buyerAccountNumber,amount,
 *  * and date properties.
 * */
public class Transaction {

    private String sellerAccountNumber;
    private String buyerAccountNumber;
    private Money amount;
    private Date date;

    public Transaction(String sellerAccountNumber, String buyerAccountNumber, Money amount, Date date) {

        this.sellerAccountNumber = sellerAccountNumber;
        this.buyerAccountNumber = buyerAccountNumber;
        this.amount = amount;
        this.date = date;
    }

    public String getSellerAccountNumber() {
        return sellerAccountNumber;
    }

    public void setSellerAccountNumber(String sellerAccountNumber) {
        this.sellerAccountNumber = sellerAccountNumber;
    }

    public String getBuyerAccountNumber() {
        return buyerAccountNumber;
    }

    public void setBuyerAccountNumber(String buyerAccountNumber) {
        this.buyerAccountNumber = buyerAccountNumber;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(sellerAccountNumber, that.sellerAccountNumber) ||
                Objects.equals(buyerAccountNumber, that.buyerAccountNumber) ||
                Objects.equals(amount, that.amount) ||
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellerAccountNumber, buyerAccountNumber, amount, date);
    }
}
