package com.techmeskills.homework_6.basik.task.creditcard;

import java.util.Scanner;

public class CreditCard {
    String numAccount;
    double currentSum;

    //to create constructor
    public CreditCard(String numAccount, double currentSum) {

        this.numAccount = numAccount;
        this.currentSum = currentSum;
    }

    //to create method to add amount of money
    public void addAmountMoney(String idNum, int addSum) {

        if (idNum == numAccount) {
            currentSum += addSum;
            System.out.println("|Number of account|" + idNum + "|added amount of money |" + addSum + "|Current amount of cash|" + currentSum);
        } else System.out.println("it's wrong idNum,please try it again");
    }

    //to create method subtraction amount of money
    public void subtrAmountMoney(String idNum, int subSum) {
        if (idNum == numAccount) {
            currentSum -= subSum;
            System.out.println("|Number of account|" + idNum + "|subtracted amount of money |" + subSum + "|Current amount of cash|" + currentSum);
        } else System.out.println("it's wrong idNum,please try it again");
    }

    public void reciveInfAccount() {
        System.out.println(" ID_NUMBER " + numAccount + " Current amount of money " + currentSum);
    }
}

