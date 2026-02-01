package com.opps.inheritance.MethodOverriding;

class phone{
    public void call(){
        System.out.println("Normal Call");
    }
}

class smartphone extends phone{
    @Override
    public void call(){
        System.out.println("HD-Voice Call");
    }

    public void search(){
        System.out.println("Normal Search");
    }
}

class flipPhone extends smartphone{
    @Override
    public void search(){
        System.out.println("Safe-Search");
    }
}

public class MobileDriver {

    public static void main(String[] args) {
        phone p=new phone();
        p.call();
        smartphone s=new smartphone();
        s.call();
        s.search();
        flipPhone f=new flipPhone();
        f.call();
        f.search();
    }
}
