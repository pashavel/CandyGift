package Comparators;

import Candy.Candy;

import java.util.Comparator;

public class CompareBySugarContainment implements Comparator <Candy>{

    @Override
    public int compare(Candy o1, Candy o2) {
        return (int) (o1.getSugarContainment()-o2.getSugarContainment());
    }
}
