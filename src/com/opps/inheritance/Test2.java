package com.opps.inheritance;
class AA{
    static {
        System.out.println("static block-1-AA");
    }
    {
        System.out.println("non-static block-2-AA");
    }
    AA(){
        System.out.println("AA()-cont");
    }
}

class BB extends AA{
    static {
        System.out.println("static block-1-BB");
    }
    {
        System.out.println("non-static block-2-BB");
    }
    BB(){
        System.out.println("BB()-cont");
    }
}
public class Test2 {
    public static void main(String[] args) {
        new BB();
    }

}
