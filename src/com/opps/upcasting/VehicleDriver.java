package com.opps.upcasting;
import java.util.Scanner;
class Vehicle {
    public void start() {}
    public void accelerate() {}
    public void stop() {}
}

class BMW extends Vehicle {
    @Override
    public void start() {
        System.out.println("BMW started");
    }

    @Override
    public void accelerate() {
        System.out.println("BMW going");
    }

    @Override
    public void stop() {
        System.out.println("BMW stopped");
    }
}

class Audi extends Vehicle {
    @Override
    public void start() {
        System.out.println("Audi started");
    }

    @Override
    public void accelerate() {
        System.out.println("Audi going");
    }

    @Override
    public void stop() {
        System.out.println("Audi stopped");
    }
}

class Benz extends Vehicle {
    @Override
    public void start() {
        System.out.println("Benz started");
    }

    @Override
    public void accelerate() {
        System.out.println("Benz going");
    }

    @Override
    public void stop() {
        System.out.println("Benz stopped");
    }
}

public class VehicleDriver {
    public static void drive(Vehicle v) {
        v.start();
        v.accelerate();
        v.stop();
    }

    public static Vehicle getCar() {
        Scanner s = new Scanner(System.in);
        System.out.println("1.BMW\n2.Audi\n3.Benz");
        int n = s.nextInt();
        if (n == 1)
            return new BMW();
        else if (n == 2)
            return new Audi();
        else if (n == 3)
            return new Benz();
        else {
            System.out.println("Invalid Input");
            return null;
        }
    }

    public static void main(String[] args) {
        drive(getCar());
    }

}
