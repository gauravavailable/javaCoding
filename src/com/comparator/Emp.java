
package com.comparator;

public class Emp  {
    String name;
    int age;
    int id;

    public Emp(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

/*
<--------------------------COMPARATOR-------------------------------------->
--> Comparator is a interface available in java.util package, which is used to short the object
--> It is used for custom sorting of an object;
--> Comparator have compare (obj o1,obj o2).
*/
