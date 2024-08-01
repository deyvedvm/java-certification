package dev.deyve.chapter1;

/**
 * Question 36 - What is the output of the following application?
 *
 * <p>
 * A. 2 5
 * B. 8 5
 * C. 6 5
 * D. The code does not compile.
 * E. None of the above.
 * </p>
 */

public class Airplane {
    static int start = 2;
    final int end;

    public Airplane(int x) {
        x = 4;
        end = x;
    }

    public void fly(int distance) {
        System.out.print(end - start + " ");
        System.out.print(distance);
    }

    public static void main(String... start) {
        new Airplane(10).fly(5);
    }
}

// Answer: A. 2 5
