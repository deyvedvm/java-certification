package dev.deyve.chapter6;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Fill in the blanks so this code prints *8.0-8.0* (Choose two.)
 * <p>
 * A.averageAsDouble() in the first blank
 * B.average().getAsDouble() in the first blank
 * C.getAverage().get() in the first blank
 * D.average() in the second blank
 * E.average().get() in the second blank
 * F.getAverage() in the second blank
 * </p>
 */
public class Question48 {

    public static void main(String[] args) {

        var ints = IntStream.of(6, 10);
        var longs = ints.mapToLong(i -> i);
        var first = longs.average().getAsDouble();

        var moreLongs = LongStream.of(6, 10);
        var stats = moreLongs.summaryStatistics();
        var second = stats.getAverage();

        System.out.println("*" + first + "-" + second + "*");
    }
}

// Answer: B. average().getAsDouble() in the first blank
//         F. getAverage() in the second blank
