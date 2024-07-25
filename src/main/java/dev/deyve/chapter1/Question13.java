package dev.deyve.chapter1;

import java.time.*;

/**
 * What is the result of the following?
 * <p>
 A. false false
 B. false true
 C. true true
 D. true false
 E. The code does not compile.
 * </p>
 */
public class Question13 {

    public static void main(String[] args) {

            var waffleDay = LocalDate.of(2022, Month.MARCH, 25);
            var period = Period.of(1, 6, 3);
            var later = waffleDay.plus(period);
            later.plusDays(1);

            var thisOne = LocalDate.of(2023, Month.SEPTEMBER, 28);
            var thatOne = LocalDate.of(2023, Month.SEPTEMBER, 29);

            System.out.println(later.isBefore(thisOne) + " " + later.isBefore(thatOne));
    }
}

// Answer: B. false true
