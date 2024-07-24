package dev.deyve.chapter1;

import java.time.LocalDate;

/**
 * What does the following output?
 * int year = 1874;
 * int month = Month.MARCH;
 * int day = 24;
 * LocalDate date = LocalDate.of(year, month, day);
 * System.out.println(date.isBefore(LocalDate.now()));
 * <p>
 * 8.
 * A.false
 * B.true
 * C.The code does not compile.
 * D.The code compiles but throws an exception at runtime.
 * </p>
 */
public class Question07 {

    public static void main(String[] args) {
        int year = 1874;
        // int month = Month.MARCH; // Compilation error
        int day = 24;
        // LocalDate date = LocalDate.of(year, month, day);
        // System.out.println(date.isBefore(LocalDate.now()));
    }
}

// Answer: C. The code does not compile.
