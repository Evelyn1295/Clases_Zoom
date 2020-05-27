package com.ironhack.interfaces;

import com.ironhack.classes.Transaction;

import java.util.ArrayList;
import java.util.Date;

/**
 * Like abstract classes, interfaces cannot be used to create objects
 * Interface methods do not have a body - the body is provided by the "implement" class
 * On implementation of an interface, you must override all of its methods
 * Interface methods are by default abstract and public
 * Interface attributes are by default public, static and final
 * An interface cannot contain a constructor (as it cannot be used to create objects)
 * **/

/**
 ** Create a TransactionList interface that has the methods getLastTransaction which returns a Transaction object,
 ** addTransaction which is void and takes a Transaction as a parameter,
 ** getTransactionByDate which takes a Date parameter and returns a Transaction object,
 ** and getAllTransactions which returns an ArrayList of Transaction objects.
 **/

public interface TransactionList {
    //Si vamos a poner la visibilidad, que sea en todos los métodos.
    Transaction getLastTransaction();
    void addTransaction(Transaction transaction);
    Transaction getTransactionByDate(Date date);
    ArrayList<Transaction> getAllTransactions();

}
