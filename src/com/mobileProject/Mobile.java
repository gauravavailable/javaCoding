package com.mobileProject;

public class Mobile {

    public String Name;
    public int RAM;
    public int ROM;
    public String Color;
    public Double Price;

    public Mobile(String name, int RAM, int ROM, String color, Double price) {
        Name = name;
        this.RAM = RAM;
        this.ROM = ROM;
        Color = color;
        Price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "Name='" + Name + '\'' +
                ", RAM=" + RAM +
                ", ROM=" + ROM +
                ", Color='" + Color + '\'' +
                ", Price=" + Price +
                '}';
    }
}
