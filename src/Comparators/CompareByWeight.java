package Comparators;

import Candy.Candy;

import java.util.Comparator;

public class CompareByWeight implements Comparator<Candy> {
    @Override
    public int compare(Candy o1, Candy o2) {
        return o1.getWeight()-o2.getWeight();
    }
}
