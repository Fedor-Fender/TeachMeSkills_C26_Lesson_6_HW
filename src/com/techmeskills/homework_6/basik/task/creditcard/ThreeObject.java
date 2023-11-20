package com.techmeskills.homework_6.basik.task.creditcard;

import java.util.Scanner;

public class ThreeObject {
    public static void main(String[] args) {

        //to create new object via data of constructor
        CreditCard object1 = new CreditCard("BK123123", 1500);

        //to create new object via input parametrs of constructor
        CreditCard object2 = new CreditCard("ST567567", 1000);

        //to create new object via data of constructor
        CreditCard object3 = new CreditCard("RF897989", 1800);

        // to call method for object 1
        object1.addAmountMoney("BK123123", 100);
        object1.reciveInfAccount();

        // to call method for object 2
        object2.addAmountMoney("ST567567", 555);
        object2.reciveInfAccount();

        // to call method for object 3
        object3.subtrAmountMoney("RF897989", 1200);
        object3.reciveInfAccount();
    }
}
