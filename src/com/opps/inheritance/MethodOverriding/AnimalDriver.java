package com.opps.inheritance.MethodOverriding;
class Animal{
    public void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Bow-Bowwww");
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow-Meooww");
    }
}

public class AnimalDriver {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.sound();
        Dog d=new Dog();
        d.sound();
        Cat c=new Cat();
        c.sound();
    }
}
