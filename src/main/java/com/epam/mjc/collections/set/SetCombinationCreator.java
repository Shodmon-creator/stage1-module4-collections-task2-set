package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new HashSet<>(firstSet);
        Set<String> set1 = new HashSet<>(thirdSet);
        set1.removeAll(firstSet);
        set1.removeAll(secondSet);

        set.retainAll(secondSet);
        set.removeAll(thirdSet);
        set.addAll(set1);


        return set;
    }
}
