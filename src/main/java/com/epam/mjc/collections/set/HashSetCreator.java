package com.epam.mjc.collections.set;
import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> set = new HashSet<>(sourceList);
        for (int k : set) {
            while (k % 2 == 0) {
                hashSet.add(k);
                k /= 2;
            }
            hashSet.add(k);
            hashSet.add(k * 2);
        }
        return hashSet;
    }
}
