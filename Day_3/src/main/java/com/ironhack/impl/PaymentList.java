package com.ironhack.impl;


import com.ironhack.classes.Transaction;
import com.ironhack.interfaces.TransactionList;
import com.ironhack.interfaces.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 ** Implement the interface in a class called PaymentList.
 ** PaymentList should have an ArrayList property that contains all Transactions.
 ** It should implement all methods from the interface.
 **/
class PaymentList implements TransactionList {

    private List<Transaction> transactions = new ArrayList<Transaction>();

    public PaymentList(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Transaction getLastTransaction() {

        if(!transactions.isEmpty()){
            if(transactions.size()==1){
                return transactions.get(0);
            }
            transactions.get(transactions.size()-1);
        }

        return null;
    }


    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public Transaction getTransactionByDate(Date date) {

        if(!transactions.isEmpty()){
            for(Transaction t : transactions){
                if(t.getDate().equals(date)){
                    return t;
                }
            }
        }

        return null;
    }

    public ArrayList<Transaction> getAllTransactions() {

        if(!transactions.isEmpty()){
            return (ArrayList<Transaction>) transactions;
        }

        return null;
    }


}
