package com.opps.Abstraction;


abstract class Shape{
    String color;

    public Shape (String color) {
        this.color = color;
    }
    abstract public void getArea();
    public abstract void display();
}

class Rectangle extends Shape{
    int length;
    int breadth;

    public Rectangle(String color,int length,int breadth){
        super(color);
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public void getArea(){
        System.out.println(length*breadth);
    }
    @Override
    public void display(){
        System.out.println("color:"+color);
        System.out.println("length:"+length);
        System.out.println("breadth:"+breadth);
    }
}
class Circle extends Shape {
    int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println(3.14 * (radius * radius));
    }

    @Override
    public void display() {
        System.out.println("color:" + color);
        System.out.println("radius:" + radius);
    }

    public class ShapeDriver {
        public static void main(String[] args) {
            Shape s;
            s = new Rectangle("Black", 10, 20);
            s.getArea();
            s.display();
            System.out.println("--------------");
            s = new Circle("white", 10);
            s.getArea();
            s.display();
        }
    }
}
