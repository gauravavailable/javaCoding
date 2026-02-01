package com.opps.Abstraction;


abstract class A1 {
    abstract public void m1();
    abstract public void m2();

}

abstract  class B1 extends A1{
    @Override
    public void m1(){
        System.out.println("m1()-B");
    }
}

class C1 extends B1{
    @Override
    public void m2(){
        System.out.println("m2()-C");
    }

}

public class Demo1{
    public static void main(String[] args) {
        A1 a=new C1();
        a.m1(); //m1()-B
        a.m2(); //m1()-C
    }
}
