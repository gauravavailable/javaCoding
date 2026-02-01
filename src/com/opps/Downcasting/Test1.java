package com.opps.Downcasting;

public class Test1 {
    public static void main(String[] args) {
        Animal a=new Dog();
        System.out.println(a instanceof Animal);//true
        System.out.println(a instanceof Dog); //true
        System.out.println(a instanceof BabyDog);//false
        System.out.println(a instanceof Cat);//false
        System.out.println("=====================");

        a=new BabyDog();
        System.out.println(a instanceof Animal);//true
        System.out.println(a instanceof Dog);//true
        System.out.println(a instanceof BabyDog);//true
        System.out.println(a instanceof Cat);//false
        System.out.println("=====================");

        a=new Cat();
        System.out.println(a instanceof Animal);//true
        System.out.println(a instanceof Dog);//false
        System.out.println(a instanceof BabyDog);//false
        System.out.println(a instanceof Cat);//true
    }
}
