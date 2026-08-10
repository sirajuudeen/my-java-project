package org.example;

import java.util.Date;

public class mainClass {
    public static void main(String[] args) {
        Date date=new Date();
        bankAccount1 bankAccount1=new bankAccount1("12324",5000,date);
        System.out.println(bankAccount1.bankAccountNumber());
        System.out.println(bankAccount1.balance());
        System.out.println(bankAccount1.dateOpened());

        //going to modify existing date time
        date.setTime(date.getTime()+30000L);
        System.out.println(bankAccount1.dateOpened());
        System.out.println("Bank Duplicate numbers are:Changes 3 ");
    }
}
