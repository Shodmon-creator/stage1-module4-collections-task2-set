package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> treeSet = new TreeSet<>();
        for (Integer x : sourceList) {
            treeSet.add(x * x);
        }
        return treeSet.subSet(lowerBound, upperBound + 1);
    }
}
