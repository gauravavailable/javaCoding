package com.opps.Downcasting;

import java.util.Scanner;

class Vehicle
{
    public void start(){

    }
    public void acc(){

    }
    public void stop(){

    }
}

class BMW extends Vehicle{
    @Override
    public void start(){
        System.out.println("BMW-Start");
    }
    @Override
    public void acc(){
        System.out.println("BMW-acc");
    }
    @Override
    public void stop(){
        System.out.println("BMW-Stop");
    }
    public void autopilot(){
        System.out.println("BMW-Autopilot");
    }
}


class BENZ extends Vehicle{
    @Override
    public void start(){
        System.out.println("BENZ-Start");
    }
    @Override
    public void acc(){
        System.out.println("BENZ-acc");
    }
    @Override
    public void stop(){
        System.out.println("BENZ-Stop");
    }
    public void GPS(){
        System.out.println("BENZ-GPS");
    }
}


class Audi extends Vehicle{
    @Override
    public void start(){
        System.out.println("AUDI-Start");
    }
    @Override
    public void acc(){
        System.out.println("AUDI-acc");
    }
    @Override
    public void stop(){
        System.out.println("AUDI-Stop");
    }
    public void ABS(){
        System.out.println("AUDI-ABS");
    }
}
public class VehicleDriver {
    public static Vehicle getcar(){
        System.out.println("1.BMW\n2.BENZ\n3.AUDI\n4.None");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==1) return new BMW();
        else if (n==2) return new BENZ();
        else if (n==3) return new Audi();
        else {
            System.out.println("Invalid");
            return null;
        }

    }

    public static void drive(Vehicle v){
        v.start();
        v.acc();
        if (v instanceof BMW)
        ((BMW)v).autopilot();
        else if (v instanceof BENZ)
            ((BENZ)v).GPS();
        else if (v instanceof Audi)
            ((Audi)v).ABS();
        v.stop();
    }

    public static void main(String[] args) {
        drive(getcar());
    }
}
