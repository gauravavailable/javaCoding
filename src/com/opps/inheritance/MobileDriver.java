package com.opps.inheritance;
class phone{
    String name;
    int num;
    String color;

    public phone(String name,int num,String color){
        this.name=name;
        this.num=num;
        this.color=color;
    }
}

class SmartPhone extends phone{
    int ram;
    int rom;
    int pxl;

    public SmartPhone(String name,int num,String color,int ram,int rom,int pxl){
        super(name,num,color);
        this.ram=ram;
        this.rom=rom;
        this.pxl=pxl;
    }

    public void display(){
        System.out.println(name +"\n" + num +"\n" + color +"\n" + ram +"\n" + rom +"\n" + pxl);
    }
}
public class MobileDriver {
    public static void main(String[] args) {
        SmartPhone s= new SmartPhone("oppo",73696981,"blue",8,128,48);
        s.display();
    }
}
