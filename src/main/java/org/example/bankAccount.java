package org.example;

import java.util.Date;

public class bankAccount {
    private final String bankAccountNumber;
    private final double balance;
    private final Date dateOpened;

    public bankAccount(String bankAccountNumber, double balance, Date dateOpened) {
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;

        //Deeply copied
        this.dateOpened = new Date(dateOpened.getTime());
        //this.dateOpened = dateOpened;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateOpened() {
        return dateOpened;
    }

    @Override
    public String toString() {
        return "bankAccount{" +
                "bankAccountNumber='" + bankAccountNumber + '\'' +
                ", balance=" + balance +
                ", dateOpened=" + dateOpened +
                '}';
    }
}
