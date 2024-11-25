package dev.deyve.chapter5;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * What does the following output?
 * <p>
 * A. [a, lamb, had, Mary, little]
 * B. [a]
 * C. [a, a]
 * D. The code does not compile.
 * E. The code throws an exception at runtime.
 * </p>
 */

public class Question79 {

    public static void main(String[] args) {
        List<String> list = List.of("Mary", "had", "a", "little", "lamb");

        Set<String> set = new HashSet<>(list);
        set.addAll(list);

        for (String sheep : set)
            if (sheep.length() > 1)
                set.remove(sheep);

        System.out.println(set);
    }
}

// Answer: E. The code throws an exception at runtime.