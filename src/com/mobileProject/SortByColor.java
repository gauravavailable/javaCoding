package com.mobileProject;

import java.util.Comparator;

public class SortByColor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Mobile m1 = (Mobile) o1;
        Mobile m2 = (Mobile) o2;

        return m1.Color.compareTo(m2.Color);
    }
}

class SortByName implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Mobile m1 = (Mobile) o1;
        Mobile m2 = (Mobile) o2;

        return m1.Name.compareTo(m2.Name);
    }
}

class SortByRamL_H implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Mobile r1 = (Mobile) o1;
        Mobile r2 = (Mobile) o2;

        return r1.RAM - r2.RAM;

    }
}

class SortByRamH_L implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Mobile r1 = (Mobile) o1;
        Mobile r2 = (Mobile) o2;

        return r2.RAM - r1.RAM;

    }
}

class SortByRomL_H implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Mobile r1 = (Mobile) o1;
        Mobile r2 = (Mobile) o2;

        return r1.ROM - r2.ROM;

    }
}

class SortByRomH_L implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Mobile r1 = (Mobile) o1;
        Mobile r2 = (Mobile) o2;

        return r2.ROM - r1.ROM;

    }
}

class SortByPriceL_H implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Mobile r1 = (Mobile) o1;
        Mobile r2 = (Mobile) o2;

        return (int)(r1.Price - r2.Price);

    }
}

class SortByPriceH_L implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Mobile r1 = (Mobile) o1;
        Mobile r2 = (Mobile) o2;

        return (int) (r2.Price - r1.Price);

    }
}





