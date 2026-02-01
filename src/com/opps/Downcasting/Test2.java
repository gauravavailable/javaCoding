package com.opps.Downcasting;

public class Test2 {
    public static void main(String[] args) {
        Dog d= new Dog();
        Animal a=(Animal) d;// upcasting (Dog to Animal)
        Dog d1=(Dog) a; // Downcasting (Animal to Dog)
    }
}
