package com.opps.Downcasting;


class Animal{
    public void eat(){
        System.out.println("Animal-Eat");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog-Eat");
    }

    public void bark(){
        System.out.println("Dog-bark");
    }
}

class BabyDog extends Dog{
    @Override
    public void eat(){
        System.out.println("BabyDog-Eat");
    }
    @Override
    public void bark(){
        System.out.println("BabyDog-bark");
    }

    public void Weep(){
        System.out.println("BabyDog-Weep");
    }
}

class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("Cat-Eat");
    }
}


public class AnimalDriver {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.eat();//Dog-Eat
        Dog d= (Dog) a;
        d.eat();//Dog-Eat
       // BabyDog b=(BabyDog) a;//C.C.E
        Animal a1=new BabyDog();
        a1.eat();// BabyDog-Eat
        Dog d1 = (Dog) a1;
        d1.eat();// BabyDog-Eat
        d1.bark();// BabyDog-Bark
        //d1.weep(); // C.T.E
        BabyDog b1=(BabyDog) d1;
        BabyDog b2=(BabyDog) a1;
        b1.eat();//BabyDog-Eat
        b1.bark();// BabyDog-Bark
        b1.Weep();// BabyDog-Weep
    }
}
