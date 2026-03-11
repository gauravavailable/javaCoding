package com.comparableInterface;

public class Emp implements Comparable {
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

    @Override
    public int compareTo(Object o) {
        Emp e = (Emp) o;

        if (this.id>e.id) return 1;
        else if (this.id<e.id) return -1;
        return 0;


        /*
        --> Instead of 3 lines  we will write only 1 line
        return this.age - e.age;
         */

        /*
        --> For String Comparison we use CompareTo();
        return this.name.compareTo(e2.name);
         */

    }
}



/*
--> <---------------------------COMPARABLE-Interface------------------------------------>
--> Comparable is a functional interface available java.lang package.
--> Comparable interface is user to sort the object.
--> Comparable interface having CompareTo().
--> It will return positive value, if current objet value greater than given object value.
--> It will return negative value, if current objet value lesser than given object value.
--> It will return Zero, when both the object having equal value.
--> Comparable Interface is user for default sorting order or natural order.
--> Comparable follows single sorting sequence.



--> <--------------------------COMPARATOR-------------------------------------->
--> Comparator is an interface available in java.util package, which is used to short the object
--> It is used for custom sorting of an object;
--> Comparator have compare (obj o1,obj o2).

<------------------Difference between Comparable & comparator--------------------->

     * Comparable:-
     * --> Comparable is an interface available in java.lang package
     * --> Comparable is user for default sorting order.
     * --> comparable supports single sorting sequence.
     * --> comparable having compare two method with one argument.
     * --> Comparable effect the original class.
     *
     *
     *
     * Comparator:-
     * --> Comparator is an interface available in java.util package.
     * -->Comparator is user for custom sorting order.
     * --> comparator supports multiple sorting sequence.
     * --> Comparator having compare method with two argument.
     * --> Comparator will not affect the original class.

*/