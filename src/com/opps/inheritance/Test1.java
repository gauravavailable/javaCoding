package com.opps.inheritance;
class A{
    A(int i){
        System.out.println("A(int i)-cons:"+i);
    }
}

class B extends A{
    B(int i){
        super(i);
        System.out.println("B(int i)-cons:"+i);
    }
}
class C extends B{
    C() {
        super(20);
    }
}
public class Test1 {
    public static void main(String[] args) {
        new C();
    }
}
