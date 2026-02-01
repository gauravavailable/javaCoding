package com.opps.inheritance.MethodOverriding;

import java.sql.SQLOutput;

class Bank{
    int rateOfIntrest(){
        return 0;
    }
}

class SBI extends Bank {
    @Override
    int rateOfIntrest() {
        return 10;
    }
}

class ICICI extends Bank {
    @Override
    int rateOfIntrest() {
        return 12;
    }
}class AXIS extends Bank {
    @Override
    int rateOfIntrest() {
        return 7;
    }
}


public class BankDriver {
    public static void main(String[] args) {
        Bank b= new Bank();
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();


        System.out.println("Bank rate of Int is :" +b.rateOfIntrest());
        System.out.println("Bank rate of Int is :" +s.rateOfIntrest());
        System.out.println("Bank rate of Int is :" +i.rateOfIntrest());
        System.out.println("Bank rate of Int is :" +a.rateOfIntrest());
    }
}
