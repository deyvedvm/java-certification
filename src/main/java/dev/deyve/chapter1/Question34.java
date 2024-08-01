package dev.deyve.chapter1;

import java.time.*;

/**
 * What is a possible result of the following?
 *
 * <p>
 * A. 2022-05-09
 * B. 2022-05-09T05:40
 * C. 2022-05-10T05:40
 * D. The code does not compile.
 * E. None of the above.
 * </p>
 */
public class Question34 {

    public static void main(String[] args) {

        var montyPythonDay = LocalDate.of(2022, Month.MAY, 10);
        var time = LocalTime.of(5, 40);

        var dateTime = LocalDateTime.of(montyPythonDay, time);
        var duration = Duration.ofDays(1);

        var result = dateTime.minus(duration);

        System.out.println(result);
    }
}

// Answer: B. 2022-05-09T05:40
