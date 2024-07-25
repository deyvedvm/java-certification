package dev.deyve.chapter1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

/**
 * What is a possible result of the following?
 * <p>
 * A. 2023-05-09 false
 * B. 2023-05-09 true
 * C. The code does not compile.
 * D. None of the above.
 * </p>
 */
public class Question15 {

    public static void main(String[] args) {

        var montyPythonDay = LocalDate.of(2023, Month.MAY, 10);
        var aprilFools = LocalDate.of(2023, Month.APRIL, 1);
        var duration = Duration.ofDays(1);

        var result = montyPythonDay.minus(duration);
        System.out.println(result + " " + aprilFools.isBefore(result));
    }
}

// Answer: D. None of the above.
