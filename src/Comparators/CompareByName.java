package Comparators;

import Candy.Candy;

import java.util.Comparator;

public class CompareByName implements Comparator<Candy> {
    @Override
    public int compare(Candy o1, Candy o2) {
     return o1.getName().compareTo(o2.getName());
    }
}

